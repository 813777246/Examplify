package com.itheima.service.impl;

import com.itheima.dao.Dao;
import com.itheima.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("service")  //此处service为bean的id
public class ServiceImpl implements Service {

    @Value("${jdbc.driver}")
    private String name;
    //自动注入
    @Autowired
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }
    @Override
    public void sSave() {
        System.out.println(name);
        System.out.println("调用dao层的方法");
        dao.save();
    }
}
