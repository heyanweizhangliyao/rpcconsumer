package com.heyanwei;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by heyanwei-thinkpad on 2019/5/29.
 */
@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.heyanwei.rpc.service.**")
public class Bootstrap {


    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }

}
