package com.yanzhen.controller;

import com.yanzhen.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private ClassInfoService classService;
//    @RequestMapping("/index")
//    public String Index(){
////        classService.queryClassInfoAll();
//        System.out.println("Controller层应用...");
//        return "index";
//    }

}
