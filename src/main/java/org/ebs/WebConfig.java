package org.ebs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.jcache.JCacheCacheManager;
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

	/**
	 * Allows to update cache objects for persisting operations through put/evict annotations
	 * accordingly to transaction semantics in services
	 * @param cacheManager
	 */
	@Autowired
	public void cacheManager( CacheManager cacheManager ) {
		JCacheCacheManager cacheM = (JCacheCacheManager) cacheManager;
		cacheM.setTransactionAware(true);
	}

}