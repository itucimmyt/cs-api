package org.ebs.security;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
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
@Profile({"dev","test"})
class DevAuthenticationFilter extends AbstractAuthenticationFilter {

    private final static Logger LOG = LoggerFactory.getLogger(DevAuthenticationFilter.class);

	    @Autowired
	    public DevAuthenticationFilter(UserDetailsService userDetailsService) {
			super(userDetailsService);
            LOG.info("CREATING DEVELOPMENT FILTER");
            LOG.info("CREATING DEVELOPMENT FILTER");
            LOG.info("CREATING DEVELOPMENT FILTER");
		}

        @Override
        public String getUsername(HttpServletRequest request) {
            return "admin";
        }


    
}