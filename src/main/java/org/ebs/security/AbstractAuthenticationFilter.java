package org.ebs.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Helper Filter for authentication. If a valid token is found in the request, a
 * valid Authentication is set in Spring Security Context during the life of
 * this request.
 * 
 * @author jarojas
 *
 */
abstract class AbstractAuthenticationFilter extends OncePerRequestFilter implements AuthenticationFilter {

    private final static Logger LOG = LoggerFactory.getLogger(AuthenticationFilter.class);

    protected final UserDetailsService userDetailsService;

	    public AbstractAuthenticationFilter(UserDetailsService userDetailsService) {
			super();
			this.userDetailsService = userDetailsService;
		}

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
    	
        setSecurityContext(request);
        chain.doFilter(request, response);
    }

    /**
	 * Tries to retrieve a token from the request headers 
	 * and set the Authentication in the Security Context
	 */
    void setSecurityContext(HttpServletRequest request) {
        String username = getUsername(request);

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

            LOG.trace("Setting security context for authenticated user: {}", username);
            setAuthentication(userDetailsService.loadUserByUsername(username), request);
        }
    }

    private void setAuthentication(UserDetails userDetails, HttpServletRequest request) {
        UsernamePasswordAuthenticationToken authentication = 
        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        authentication.setDetails(
                new WebAuthenticationDetailsSource().buildDetails(request));

        SecurityContextHolder.getContext().setAuthentication(authentication);

    }
}