package cn.edu.ahau.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @description
 * @author zhangys
 * @date 2020/4/21
 */
@ImportResource(locations = {"classpath:config/spring-dubbo-newsprovider.xml"})
//@ComponentScan(basePackages = {"cn.edu.ahau.news","cn.edu.ahau.base.utils"})
@SpringBootApplication
public class NewsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsProviderApplication.class, args);
    }

}
