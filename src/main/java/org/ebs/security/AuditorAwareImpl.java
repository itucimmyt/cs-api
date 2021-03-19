package org.ebs.security;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * Provides user information from Security Context to Auditable entities
 */
@Component
class AuditorAwareImpl implements AuditorAware<Integer> {

    @Override
    public Optional<Integer> getCurrentAuditor() {
        Authentication auth= SecurityContextHolder.getContext().getAuthentication();
        return Optional.of(((EbsUser)auth.getPrincipal()).getId());
    }

}