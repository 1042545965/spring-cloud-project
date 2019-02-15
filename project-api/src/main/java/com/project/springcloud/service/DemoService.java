package com.project.springcloud.service;

import com.project.springcloud.entitys.SysUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PROJECT-PROVIDE-DEMO")
public interface DemoService {

    @GetMapping(value="/user/getUser/{id}")
    public SysUser getUser(@PathVariable("id") Long id);
}
