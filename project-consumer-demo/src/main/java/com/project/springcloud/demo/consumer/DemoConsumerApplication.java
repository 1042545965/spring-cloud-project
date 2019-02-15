package com.project.springcloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 这里是消费者 , 我直接排除数据源启动 , 不然会报错
 * @author dkzadmin
 * ribbon   配置完成 . 是集成在客户端的工具
 * 		什么是ribbon : 
 * 			ribbon  是在客户端器端实现负载均衡额的 , dubbo 和 springcloud 都是采用的本地负载均衡
 * 		nginx是一款在服务器端实现负载均衡的语言
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.project.springcloud"})
@ComponentScan("com.project.springcloud")
public class DemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }

}