package com.atwqq.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 16:09
 */
@Controller
@RequestMapping("/attr")
public class AttrManagerController {
    /**
     * 去平台属性页面
     *
     * @return
     */
    @RequestMapping("/listPage.html")
    public String toAttrListPage() {
        return "attr/attrListPage";
    }
}
