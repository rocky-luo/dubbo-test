package com.rocky.dubbo.test.demo.provider;

import com.rocky.demo.test.api.DemoService;

/**
 * Created by rocky on 17/12/15.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
