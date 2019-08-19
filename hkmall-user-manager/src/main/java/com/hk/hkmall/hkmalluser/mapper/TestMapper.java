package com.hk.hkmall.hkmalluser.mapper;


import com.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestMapper {


    @Select("select * from ums_member")
    public List<UmsMember> getAllUsers() ;
}
