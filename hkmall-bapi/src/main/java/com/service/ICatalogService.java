package com.service;

import com.bean.PmsBaseCatalog1;
import com.bean.PmsBaseCatalog2;
import com.bean.PmsBaseCatalog3;

import java.util.List;

public interface ICatalogService {

    List<PmsBaseCatalog1> getCatalog1();


    List<PmsBaseCatalog2> getCatalog2(Long catalog1id);


    List<PmsBaseCatalog3> getCatalog3(Long catalog2Id);
}
