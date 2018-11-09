package com.atwqq.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atwqq.gmall.manager.BaseCatalog1;
import com.atwqq.gmall.manager.BaseCatalog2;
import com.atwqq.gmall.manager.BaseCatalog3;
import com.atwqq.gmall.manager.CatalogService;
import com.atwqq.gmall.manager.mapper.BaseCatalog1Mapper;
import com.atwqq.gmall.manager.mapper.BaseCatalog2Mapper;
import com.atwqq.gmall.manager.mapper.BaseCatalog3Mapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 17:51
 */
@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;
    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;

    @Override
    public List<BaseCatalog1> getAllBaseCatalog1() {
        return baseCatalog1Mapper.selectList(null);
    }

    @Override
    public List<BaseCatalog2> getBaseCatalog2ByC1id(Integer catalog1Id) {
        QueryWrapper<BaseCatalog2> queryWrapper = new QueryWrapper<BaseCatalog2>().eq("catalog1_id", catalog1Id);
        return baseCatalog2Mapper.selectList(queryWrapper);
    }

    @Override
    public List<BaseCatalog3> getBaseCatalog3ByC2id(Integer catalog2Id) {
        QueryWrapper<BaseCatalog3> queryWrapper = new QueryWrapper<BaseCatalog3>().eq("catalog2_id", catalog2Id);
        return baseCatalog3Mapper.selectList(queryWrapper);
    }
}
