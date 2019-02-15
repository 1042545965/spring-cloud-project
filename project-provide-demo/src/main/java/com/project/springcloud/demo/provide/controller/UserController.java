package com.project.springcloud.demo.provide.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.springcloud.demo.provide.service.SysUserService;
import com.project.springcloud.entitys.SysUser;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author conlon123
 * @since 2019-01-01
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@GetMapping(value="/getUser/{id}")
	public SysUser getUser(@PathVariable("id") Long id) {
		SysUser sysUser = sysUserService.getById(id);
		if (sysUser == null){
			throw new RuntimeException("该id不存在 id {}"+id);
		}
		return sysUserService.getById(id);
	}

	@GetMapping(value="/getUserList")
	public List<SysUser> getUserList() {
		return sysUserService.list();
	}
}

