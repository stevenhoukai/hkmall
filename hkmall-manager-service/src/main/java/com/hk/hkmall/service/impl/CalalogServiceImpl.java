package com.hk.hkmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bean.PmsBaseCatalog1;
import com.hk.hkmall.mapper.PmsBaseCatalogMapper;
import com.hk.hkmall.mapper.PmsBaseCatalogMapper2;
import com.hk.hkmall.mapper.PmsBaseCatalogMapper3;
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

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalogMapper.selectAll();
        return pmsBaseCatalog1s;
    }
}
