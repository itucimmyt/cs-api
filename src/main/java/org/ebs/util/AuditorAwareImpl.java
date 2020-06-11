package org.ebs.util;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String> {

    private User placeholderUser = new User(1);

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("System");
    	//return Optional.of(placeholderUser.getUsername());
    }

}