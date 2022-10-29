package com.itheima.dao.impl;

import com.itheima.dao.Dao;
import org.springframework.stereotype.Component;

@Component("dao")  //此处dao为bean的id
public class DaoImpl implements Dao {

    @Override
    public void save() {
        System.out.println("这是Dao层的方法");
    }
}
