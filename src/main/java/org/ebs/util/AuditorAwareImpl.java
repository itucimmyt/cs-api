package org.ebs.util;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class AuditorAwareImpl implements AuditorAware<Integer> {

    private User placeholderUser = new User(1);

    @Override
    public Optional<Integer> getCurrentAuditor() {
        return Optional.of(placeholderUser.getUsername());
    }

}