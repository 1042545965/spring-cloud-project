package com.project.springcloud.servicefallback;

import com.project.springcloud.entitys.SysUser;
import com.project.springcloud.service.DemoService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component // 不要忘记添加，不要忘记添加
public class DemoServiceFallbackFactory implements FallbackFactory<DemoService> {

    @Override
    public DemoService create(Throwable throwable) {
        return new DemoService() {
            @Override
            public SysUser getUser(Long id) {
                String message = throwable.getMessage();
                message = message == null ? "该服务降级啦":message;
                SysUser sysUser = new SysUser();
                sysUser.setUserName(message);
                return sysUser;
            }

            @Override
            public List<SysUser> getUserList() {
                return null;
            }

            @Override
            public List<SysUser> getUserListByMap() {
                return null;
            }
        };
    }
}
