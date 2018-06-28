package com.winnie.dubboapi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.winnie.dubboapi.service.TestService;

/**
 * @Description: Description
 * @Author: winnie
 * @CreateDate: 2018/6/27 19:23
 * @UpdateDate: 2018/6/27 19:23
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Service(version = "1.0.0")
public class ProviderService implements TestService {

    @Override
    public String sayHello() {
        return "aaa";
    }
}
