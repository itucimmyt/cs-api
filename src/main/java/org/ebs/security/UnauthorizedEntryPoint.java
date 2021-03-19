package org.ebs.security;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.ebs.util.brapi.BrapiResponseBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * Defines an AuthenticationEntryPoint meant to dispatch failed authorization, either by missing or invalid token
 * @author jarojas
 *
 */
@Component
@RequiredArgsConstructor
public class UnauthorizedEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = 0L;
    private final ObjectMapper om;

	@Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authenticationEx) throws IOException {

        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        om.writeValue(response.getOutputStream(), BrapiResponseBuilder.forError(authenticationEx.getMessage()));
    }
}