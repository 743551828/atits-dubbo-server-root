package cn.edu.ahau.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangys
 * @description
 * @date 2020/4/21
 */
@ImportResource(locations = {"classpath:config/spring-dubbo-consumer.xml"})
//@ComponentScan(basePackages = {"cn.edu.ahau.web","cn.edu.ahau.base.utils"})
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

}
