package com.project.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 * 
 * @author conlon
 * 
 * eureka笔记
 * 		netflix设计的时候用的遵守的是ap原则
 * 		eureka是一个基于rest风格的注册服务中心 , 类似于zookeeper
 * 		eureka的基本框架
 * 				采用cs架构(客户端和server端) 服务的注册与发现
 * 				和zookeeper的区别 zk注重cp eureka是ap
 * 					记录一下cap理论(P(partition) 隔离 , A(Availability) 可用 , C(Consistency) 一致性)
 * 		eureka server 默认心跳时间是30s
 * 		eureka 的自我保护(好死不如赖活着.某一时刻某一个微服务不可用了 , 但是eureka不会立刻清理,还是会保存该服务的信息 .
 * 		 无法接收到某个微服务的信息,那么eureka就会注销 . 默认90s )
 */

@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class DemoEurekaServer
{
	public static void main(String[] args)
	{
		SpringApplication.run(DemoEurekaServer.class, args);
	}
}
