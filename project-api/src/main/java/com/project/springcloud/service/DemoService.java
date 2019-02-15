package com.project.springcloud.service;

import com.project.springcloud.entitys.SysUser;
import com.project.springcloud.servicefallback.DemoServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "PROJECT-PROVIDE-DEMO" , fallbackFactory = DemoServiceFallbackFactory.class)
public interface DemoService {

    @GetMapping(value="/user/getUser/{id}")
    public SysUser getUser(@PathVariable("id") Long id);

    @GetMapping(value="/user/getUserList")
    public List<SysUser> getUserList();

    @GetMapping(value="/user/getUserListByMap")
    public List<SysUser> getUserListByMap();
}
