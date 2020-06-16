package org.ebs.security;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Replacement for authentication, ONLY FOR DEVELOPMENNT AND TESTING ENVIRONMENTS.
 * It has to be explicitly declared in environment to work
 * users
 * 
 * @author jarojas
 *
 */
@Service
@Transactional(readOnly=true)
@Profile({ "dev", "test" })
class TestingUserDetailsServiceImpl implements UserDetailsService {

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //TODO connect here Tenant services to retrieve grants for a specific user
        List<GrantedAuthority> auths = Arrays.asList(
            new SimpleGrantedAuthority("VOID_GRANT"), 
            new SimpleGrantedAuthority("EMPTY_GRANT"));
        
        return new EbsUser(username, auths, true);
    }

}
