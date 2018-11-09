package com.atwqq.gmall.manager;

import java.util.List;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 19:01
 */
public interface BaseAttrInfoService {
    /**
     * 获取三级分类下的属性名
     * @param catalog3Id
     * @return
     */
    public List<BaseAttrInfo> getBaseAttrInfoByCatalog3Id(Integer catalog3Id);

    /**
     * 获取某个平台属性的所有属性值
     * @param baseAttrInfoId
     * @return
     */
    public List<BaseAttrValue> getBaseAttrValueByAttrId(Integer baseAttrInfoId);
}
