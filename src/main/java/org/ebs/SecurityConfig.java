package org.ebs;

import org.ebs.security.AuthenticationFilter;
import org.ebs.security.UnauthorizedEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableJpaAuditing(modifyOnCreate = false)
class SecurityConfig extends WebSecurityConfigurerAdapter{

  private UnauthorizedEntryPoint unauthorizedEntryPoint;
  private AuthenticationFilter authenticationFilter;
  private UserDetailsService userDetailsService;

  @Autowired
  public SecurityConfig(UnauthorizedEntryPoint unauthorizedEntryPoint, AuthenticationFilter authenticationFilter,
      UserDetailsService userDetailsService) {
    this.unauthorizedEntryPoint = unauthorizedEntryPoint;
    this.authenticationFilter = authenticationFilter;
    this.userDetailsService = userDetailsService;
  }
  
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
        .anyRequest()
          .fullyAuthenticated()
      .and()
      .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class)
      .headers()
        .cacheControl();
    }

}
