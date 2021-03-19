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

import lombok.extern.log4j.Log4j2;

/**
 * Service required by Spring Security to obtain additional information about
 * users
 *
 * @author jarojas
 *
 */
@Service
@Profile({"dev", "test"})
@Log4j2
class DevUserDetailsServiceImpl implements UserDetailsService {
    public DevUserDetailsServiceImpl() {
        log.info("Creating UserDetailsService filter for DEVELOPMENT/TESTING");
    }

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> auths = Arrays.asList(
            new SimpleGrantedAuthority("VOID_GRANT"),
            new SimpleGrantedAuthority("EMPTY_GRANT"));

        return new EbsUser(1, username, auths, true);
    }

}
