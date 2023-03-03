package com.atguigu.controller;

import com.atguigu.config.BaseConfig;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SelfController {


    @RequestMapping("/aa")
    public String a1(){
        return "cucc";
    }



    @GetMapping("/employee")
    public String a2(@RequestParam Long name,@RequestParam String password, HttpServletRequest request,HttpServletResponse response){

        BaseConfig.setThreadLocal(name);

        Long threadLocal = BaseConfig.getThreadLocal();

        System.out.println("-----------" + threadLocal);


        System.out.println("request:" + request);
        System.out.println("respone:" + response);


        return "teacher";

    }
}
