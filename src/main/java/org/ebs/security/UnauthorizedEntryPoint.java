package org.ebs.security;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * Defines an AuthenticationEntryPoint meant to dispatch failed authorization, either by missing or invalid token
 * @author jarojas
 *
 */
@Component
public class UnauthorizedEntryPoint implements AuthenticationEntryPoint, Serializable {

	private static final long serialVersionUID = 0L;

	@Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authenticationEx) throws IOException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authenticationEx.getMessage());
    }
}