package org.ebs;

import org.ebs.security.AuthenticationFilter;
import org.ebs.security.UnauthorizedEntryPoint;
import org.ebs.util.AuditorAwareImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableJpaAuditing(modifyOnCreate = false)
class SecurityConfig extends WebSecurityConfigurerAdapter{

  @Autowired
  private UnauthorizedEntryPoint unauthorizedEntryPoint;
  @Autowired
  private AuthenticationFilter authenticationFilter;
  @Autowired
  private UserDetailsService userDetailsService;

  
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

    @Bean
    public AuditorAwareImpl auditorProvider() {
      return new AuditorAwareImpl();
    }

    

  /**
  * Explicitly exposing this bean since Spring Security 5 doesn't do it by default
  */
  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }
}
