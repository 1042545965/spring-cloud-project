package com.project.springcloud.demo.consumer.controller;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.springcloud.entitys.SysUser;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author conlon123
 * @since 2019-01-01
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController 
{
	public static final String RESR_URL= "http://192.168.1.76:9000";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getConsumerUser/{id}")
	public SysUser getConsumerUser(@PathVariable("id") Long id) {
		String url = null;
		try {
			url = URLEncoder. encode(RESR_URL+"/user/getUser/"+id, "utf-8" );
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return restTemplate.getForObject(RESR_URL+"/user/getUser/"+id, SysUser.class);
	}
	
}

