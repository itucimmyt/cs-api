package org.ebs;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableCaching
class WebConfig implements WebMvcConfigurer{

    /**
	 * Cross-Origin Request Sharing configuration
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
			.addMapping("/**")
			.allowedMethods("GET","POST","PUT","DELETE","OPTIONS");
    }

}