package com.yanzhen.demo;

import com.yanzhen.service.ClassInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void testdemo(){
        //查询类路径 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ClassInfoService infoService= (ClassInfoService) applicationContext.getBean("classService");
//        infoService.queryClassInfoAll();
    }

}
