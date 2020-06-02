package org.ebs.security;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Helper Filter for authentication. If a valid token is found in the request, a
 * valid Authentication is set in Spring Security Context during the life of
 * this request.
 * 
 * @author jarojas
 *
 */
@Component
public class AuthenticationFilter extends OncePerRequestFilter {

    private final static Logger LOG = LoggerFactory.getLogger(AuthenticationFilter.class);

    private final UserDetailsService userDetailsService;

	    @Autowired
	    public AuthenticationFilter(UserDetailsService userDetailsService) {
			super();
			this.userDetailsService = userDetailsService;
		}

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
    	
        setSecurityContextFromToken(request);
           
        chain.doFilter(request, response);
    }
    
	/**
	 * Tries to retrieve a token from the request headers 
	 * and set the Authentication in the Security Context
	 */
    void setSecurityContextFromToken(HttpServletRequest request) {
        String username = null;
        String token = null;
        
        try {
            token = extractToken(request);
            DecodedJWT jwt = JWT.decode(token);
            username = jwt.getClaim("http://wso2.org/claims/displayName").asString();
        } catch (Exception e) {
            LOG.error("Error reading getting token", e);
        }

        LOG.debug("Validating authentication token for: {} ", username);
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

        	EbsUser userDetails = (EbsUser)this.userDetailsService.loadUserByUsername(username);

            UsernamePasswordAuthenticationToken authentication = 
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            authentication.setDetails(
                    new WebAuthenticationDetailsSource().buildDetails(request));
            
            LOG.debug("Setting security context for authenticated user: {}", username);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
    }
    
    private String extractToken(HttpServletRequest request) {
    	return Optional.ofNullable(request.getHeader(HttpHeaders.AUTHORIZATION))
    	        .filter(header -> header.startsWith("Bearer "))
            	.map(header -> header.substring(7))
            	.orElseThrow(() -> new IllegalArgumentException("Could not extract token from request"));
    }
}