package org.ebs.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class EbsUser implements UserDetails {

    private static final long serialVersionUID = 4307744603889763661L;

    private String username;
    private Collection<? extends GrantedAuthority> authorities;
    private boolean enabled;

    public EbsUser() {
	}
    
    public EbsUser(
          String username,
          Collection<? extends GrantedAuthority> authorities,
          boolean enabled
    ) {
        this.username = username;
        this.authorities = authorities;
        this.enabled = enabled;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return enabled;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return enabled;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "EbsUser [authorities=" + authorities + ", enabled=" + enabled + ", username=" + username + "]";
    }

}