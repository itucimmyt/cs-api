package org.ebs.security;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * Helper Filter for authentication. If a valid token is found in the request, a
 * valid Authentication is set in Spring Security Context during the life of
 * this request.
 * 
 * @author jarojas
 *
 */
@Component
@Profile("default")
class TokenAuthenticationFilter extends AbstractAuthenticationFilter {

    private final static Logger LOG = LoggerFactory.getLogger(TokenAuthenticationFilter.class);

	    @Autowired
	    public TokenAuthenticationFilter(UserDetailsService userDetailsService) {
			super(userDetailsService);
            LOG.info("CREATING DEFAULT FILTER");
            LOG.info("CREATING DEFAULT FILTER");
            LOG.info("CREATING DEFAULT FILTER");
		}

    @Override
    public String getUsername(HttpServletRequest request) {
        String username = null;
        try {
            DecodedJWT jwt = JWT.decode(extractToken(request));
            username = jwt.getClaim("http://wso2.org/claims/displayName").asString();
        } catch (Exception e) {
            LOG.error("Error reading username from token", e);
        }

        return username;
    }

    private String extractToken(HttpServletRequest request) {
    	return Optional.ofNullable(request.getHeader(HttpHeaders.AUTHORIZATION))
    	        .filter(header -> header.startsWith("Bearer "))
            	.map(header -> header.substring(7))
            	.orElseThrow(() -> new IllegalArgumentException("Could not extract token from request"));
    }

}