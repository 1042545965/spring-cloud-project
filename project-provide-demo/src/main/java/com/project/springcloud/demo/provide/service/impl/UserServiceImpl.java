package com.project.springcloud.demo.provide.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.springcloud.demo.provide.dao.UserDao;
import com.project.springcloud.demo.provide.service.UserService;
import com.project.springcloud.entitys.User;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author conlon123
 * @since 2019-01-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
