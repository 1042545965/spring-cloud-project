package com.project.springcloud.demo.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者配置类
 * @author dkzadmin
 *@LoadBalanced 开启负载均衡
 */
@Configuration
public class ConfigBean 
{
	@Bean
	//开启负载均衡
	@LoadBalanced
	public RestTemplate geRestTemplate() 
	{
		return new RestTemplate();
	}
}
