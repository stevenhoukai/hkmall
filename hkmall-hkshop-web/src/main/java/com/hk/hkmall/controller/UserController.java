package com.hk.hkmall.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bean.UmsMember;
import com.hk.hkmall.hkmalluser.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

//    @Autowired
    @Reference(check = false)
    IUserService iUserService;

    @RequestMapping("/{id}")
    public String getUser(@PathVariable Integer id){
        return iUserService.getUser(id);
    }


    @RequestMapping("/index")
    public String getIndex(){
        return "hello world";
    }

    @RequestMapping("/getUsers")
    public List<UmsMember> getAllUsers(){

        return iUserService.getAllUsers();
    }

    @RequestMapping("/testlog")
    public String testlog(){
        final Logger logger = LoggerFactory.getLogger(UserController.class);
        logger.debug("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        return  "1111";
    }
}
