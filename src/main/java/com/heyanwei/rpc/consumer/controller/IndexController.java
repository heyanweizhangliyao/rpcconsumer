package com.heyanwei.rpc.consumer.controller;

import com.heyanwei.rpc.service.SayHiService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heyanwei-thinkpad on 2019/5/29.
 */
@RestController
public class IndexController {


    @Reference(version="1.0.0")
    private SayHiService sayHiService;

    @RequestMapping("/index/hi")
    public Object test(){
        return sayHiService.sayHi("Robert");
    }
}
