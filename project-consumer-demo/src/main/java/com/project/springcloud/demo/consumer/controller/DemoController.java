package com.project.springcloud.demo.consumer.controller;


import com.project.springcloud.entitys.SysUser;
import com.project.springcloud.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author conlon123
 * @since 2019-01-01
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/getConsumerUser/{id}")
    public SysUser getConsumerUser(@PathVariable("id") Long id) {
        return demoService.getUser(id);
    }

}

