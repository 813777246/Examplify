package com.itheima.test;

import com.itheima.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.jupiter.api.Test
    public void test1() throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        Service service = (Service) app.getBean("service");
        service.sSave();
    }
}
