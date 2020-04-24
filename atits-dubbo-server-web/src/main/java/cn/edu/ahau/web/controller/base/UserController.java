package cn.edu.ahau.web.controller.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangys
 * @description
 * @date 2020/4/20
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @GetMapping(value = "login")
    public String login(){
        return "ok";
    }
}
