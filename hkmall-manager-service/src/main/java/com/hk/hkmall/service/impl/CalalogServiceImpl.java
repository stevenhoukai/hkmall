package com.hk.hkmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bean.PmsBaseCatalog1;
import com.bean.PmsBaseCatalog2;
import com.bean.PmsBaseCatalog3;
import com.hk.hkmall.mapper.PmsBaseCatalogMapper;
import com.hk.hkmall.mapper.PmsBaseCatalogMapper2;
import com.hk.hkmall.mapper.PmsBaseCatalogMapper3;
import com.hk.hkmall.mapper.TestMapper;
import com.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CalalogServiceImpl implements ICatalogService {

    @Autowired
    PmsBaseCatalogMapper pmsBaseCatalogMapper;
    @Autowired
    PmsBaseCatalogMapper2 pmsBaseCatalogMapper2;
    @Autowired
    PmsBaseCatalogMapper3 pmsBaseCatalogMapper3;
    @Autowired
    TestMapper testMapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
//        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalogMapper.selectAll();
        List<PmsBaseCatalog1> test = testMapper.test();
        return test;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(Long catalog1id) {
        List<PmsBaseCatalog2> test2 = testMapper.test2(catalog1id);
        return test2;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id) {
        List<PmsBaseCatalog3> test3 = testMapper.test3(catalog2Id);
        return test3;
    }

}
