package com.atwqq.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 14:33
 */
@Controller
public class MainController {
    /**
     * ThymeleafProperties
     *  public static final String DEFAULT_PREFIX = "classpath:/templates/";
     *  public static final String DEFAULT_SUFFIX = ".html";
     * @return
     */
    @RequestMapping("/main")
    public String hello(){
        return "main";
    }
}
