package com.winnie.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.winnie.dubboapi.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Description
 * @Author: winnie
 * @CreateDate: 2018/6/27 20:08
 * @UpdateDate: 2018/6/27 20:08
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@RestController
public class TestConsumerServiceImpl {

    @Reference(version = "1.0.0")
    private TestService demoService;

    @RequestMapping("/sayHello")
    //public String sayHello(@RequestParam String name)
    public String sayHello() {

        return demoService.sayHello();
    }
}
