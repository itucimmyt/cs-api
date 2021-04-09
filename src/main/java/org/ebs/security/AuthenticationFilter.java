package org.ebs.security;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;

/**
 * Interface for Authentication Filters which want to implement a custom method
 * for retrieving the username, before invoking the authentication mechanism
 *
 * @author jarojas
 *
 */
public interface AuthenticationFilter extends Filter{
    String getUsername(HttpServletRequest request);
}