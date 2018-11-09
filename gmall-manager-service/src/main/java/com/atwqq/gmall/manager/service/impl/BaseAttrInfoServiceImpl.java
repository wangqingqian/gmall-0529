package com.atwqq.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atwqq.gmall.manager.BaseAttrInfo;
import com.atwqq.gmall.manager.BaseAttrInfoService;
import com.atwqq.gmall.manager.BaseAttrValue;
import com.atwqq.gmall.manager.mapper.BaseAttrInfoMapper;
import com.atwqq.gmall.manager.mapper.BaseAttrValueMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 19:07
 */
@Service
public class BaseAttrInfoServiceImpl implements BaseAttrInfoService {
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    BaseAttrValueMapper baseAttrValueMapper;

    @Override
    public List<BaseAttrInfo> getBaseAttrInfoByCatalog3Id(Integer catalog3Id) {
        return baseAttrInfoMapper.selectList(new QueryWrapper<BaseAttrInfo>().eq("catalog3_id", catalog3Id));
    }

    @Override
    public List<BaseAttrValue> getBaseAttrValueByAttrId(Integer baseAttrInfoId) {
        return baseAttrValueMapper.selectList(new QueryWrapper<BaseAttrValue>().eq("attr_id", baseAttrInfoId));
    }
}
