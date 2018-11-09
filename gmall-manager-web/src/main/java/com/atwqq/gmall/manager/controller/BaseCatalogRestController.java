package com.atwqq.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atwqq.gmall.manager.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 20:15
 */

/**
 * 来给easyui提供url访问，返回json数据
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/baseCatalog")
public class BaseCatalogRestController {
    @Reference//消费服务
            CatalogService catalogService;
    @Reference
    BaseAttrInfoService baseAttrInfoService;

    /**
     * 查询所有一级分类
     *
     * @return
     */
    @RequestMapping("/1/list.json")
    public List<BaseCatalog1> listBaseCatalog1() {
        return catalogService.getAllBaseCatalog1();
    }

    /**
     * 查询一级分类下的二级分类
     *
     * @param id 一级分类id
     * @return
     */
    @RequestMapping("/2/list.json")
    public List<BaseCatalog2> listBaseCatalog2(Integer id) {

        return catalogService.getBaseCatalog2ByC1id(id);

    }

    /**
     * 查询二级分类下的三级分类
     *
     * @param id 二级分类id
     * @return
     */
    @RequestMapping("/3/list.json")
    public List<BaseCatalog3> listBaseCatalog3(Integer id) {

        return catalogService.getBaseCatalog3ByC2id(id);

    }

    /**
     * 查询三级分类下的所有属性
     *
     * @param id 三级分类id
     * @return
     */
    @RequestMapping("/attrs.json")
    public List<BaseAttrInfo> getBaseAttrInfos(Integer id) {
        return baseAttrInfoService.getBaseAttrInfoByCatalog3Id(id);
    }
}
