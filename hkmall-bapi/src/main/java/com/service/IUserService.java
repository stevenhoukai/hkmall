package com.service;

import com.bean.UmsMember;

import java.util.List;

public interface IUserService {

    public String getUser(Integer id);

    public List<UmsMember> getAllUsers();
}
