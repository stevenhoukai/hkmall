package com.hk.hkmall.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.bean.PmsBaseCatalog1;
import com.service.ICatalogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatalogController {

    @Reference
    ICatalogService catalogService;

    //test
    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1() {
        return null;
    }

}
