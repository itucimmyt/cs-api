package org.ebs;

import org.ebs.security.AuthenticationFilter;
import org.ebs.security.UnauthorizedEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
@EnableJpaAuditing(modifyOnCreate = false)
@EnableGlobalMethodSecurity(prePostEnabled = true)
class SecurityConfig extends WebSecurityConfigurerAdapter{

  private final UnauthorizedEntryPoint unauthorizedEntryPoint;
  private final AuthenticationFilter authenticationFilter;
  private final UserDetailsService userDetailsService;

	@Autowired
	public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder
			.userDetailsService(userDetailsService);
	}

  @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.cors()
      .and()
      .csrf()
        .disable()
      .exceptionHandling()
        .authenticationEntryPoint(unauthorizedEntryPoint)
      .and()
      .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
      .and()
      .authorizeRequests()
        .antMatchers("/playground", "/vendor/playground/**")
          .permitAll()
        .antMatchers(HttpMethod.GET, "/actuator/**")
          .permitAll()
        .anyRequest()
          .fullyAuthenticated()
      .and()
      .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class)
      .headers()
        .cacheControl();
    }

}
