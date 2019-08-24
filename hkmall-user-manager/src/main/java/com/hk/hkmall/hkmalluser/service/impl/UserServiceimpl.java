package com.hk.hkmall.hkmalluser.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.bean.UmsMember;
import com.hk.hkmall.hkmalluser.mapper.TestMapper;
import com.hk.hkmall.hkmalluser.mapper.UserMapper;
import com.hk.hkmall.hkmalluser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceimpl implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    TestMapper testMapper;

    @Override
    public String getUser(Integer id){

        return null;
    }

    @Override
    public List<UmsMember> getAllUsers() {

        return testMapper.getAllUsers();
    }
}
