package com.lmybaby.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud-stu
 * @description:
 * @author: Liuwd
 * @create: 2020-04-09 17:24
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args){
        SpringApplication.run(EurekaMain7002.class,args);
    }

}
