package cn.edu.ahau.web.controller.base;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangys
 * @date 2020/4/20
 */
@RestController
@RequestMapping(value = "user")
@Api(tags = {"用户、登录"})
public class UserController {

    @GetMapping(value = "login")
    public String login(){
        return "ok";
    }
}
