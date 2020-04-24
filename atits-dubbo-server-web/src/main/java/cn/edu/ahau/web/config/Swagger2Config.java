package cn.edu.ahau.web.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 配置类
 *
 * @author zhangys
 * @date 2020/4/23
 */
@Configuration
@EnableSwagger2
@ConditionalOnExpression("${swagger.enable}")
public class Swagger2Config {

    @Bean
    public Docket adminApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Admin API")
                .forCodeGeneration(true)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.edu.ahau.web.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }


    private ApiInfo apiInfo(){
        Contact contact = new Contact("ahau.TeamAndCreator", "https://github.com/TeamAndCreator", "743551828@qq.com");
        return new ApiInfoBuilder()
                .title("后台管理系统")
                .description("后台API文档")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
