package com.service;

import com.bean.*;

import java.util.List;

public interface ICatalogService {

    List<PmsBaseCatalog1> getCatalog1();


    List<PmsBaseCatalog2> getCatalog2(Long catalog1id);


    List<PmsBaseCatalog3> getCatalog3(Long catalog2Id);


    List<PmsBaseAttrInfo> getBaseInfoAttrInfos(Long catalog3Id);

    List<PmsBaseAttrValue> getAttrValueList(Long attrId);
}
