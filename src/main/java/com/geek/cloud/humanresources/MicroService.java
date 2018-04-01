package com.geek.cloud.humanresources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.geek.cloud.humanresources.repository")
@EnableAutoConfiguration
@ComponentScan(value = "com.geek.cloud")
public class MicroService {


    public static  void main(String[] args){
        SpringApplication.run(MicroService.class,args);


    }


}
