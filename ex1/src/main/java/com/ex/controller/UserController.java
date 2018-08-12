package com.ex.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ex.model.User;
import com.ex.service.IUserService;
import com.ex.system.HexMD5;
import com.ex.system.PasswordEncry;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/9 17:54
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String selectUser(@RequestParam("account") String account,
                             @RequestParam("password") String password,
                             HttpServletRequest request, Model model) {


        if ("".equals(account) || "".equals(password)) {

            model.addAttribute("msg","错误");
            return "view/ex";
        }

        User user = (User) SecurityUtils.getSubject().getPrincipal();
        if(user != null){
            model.addAttribute("msg","已登录");
            return "view/ex";
        }

        password = PasswordEncry.encrypt(password);

        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(account, password));
        } catch (AuthenticationException e) {
            System.out.println("登录失败:"+ e.getMessage());
            model.addAttribute("msg","错误");
            if(subject != null){
                subject.getSession();
            }
            return "view/ex";
        }
        model.addAttribute("msg","登录成功");

        return "view/success";

    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpServletRequest request, Model model){

        User user = (User) SecurityUtils.getSubject().getPrincipal();

        return "logout";
    }

}
