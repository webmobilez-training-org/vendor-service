package com.xyz.training.vendorService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableCaching
@EnableAspectJAutoProxy
@EnableDiscoveryClient
@RefreshScope
public class VendorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorServiceApplication.class, args);
	}

}
