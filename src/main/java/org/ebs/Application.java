package org.ebs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.jcache.JCacheCacheManager;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	public void cacheManager( CacheManager cacheManager ) {
		JCacheCacheManager cacheM = (JCacheCacheManager) cacheManager;
		cacheM.setTransactionAware(true);
	}
}
