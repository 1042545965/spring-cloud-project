package com.project.springcloud.demo.provide.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.springcloud.demo.provide.dao.SysUserDao;
import com.project.springcloud.demo.provide.service.SysUserService;
import com.project.springcloud.entitys.SysUser;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author conlon123
 * @since 2019-01-10
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

}
