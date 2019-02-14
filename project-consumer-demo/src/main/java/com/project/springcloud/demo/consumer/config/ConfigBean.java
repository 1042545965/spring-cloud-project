package com.project.springcloud.demo.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者配置类
 * @author dkzadmin
 *
 */
@Configuration
public class ConfigBean 
{
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate() 
	{
		
		return new RestTemplate();
	}
}
