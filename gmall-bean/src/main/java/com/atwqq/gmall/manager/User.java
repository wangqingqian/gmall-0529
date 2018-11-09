package com.atwqq.gmall.manager;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 11:40
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic //表示这个字段是逻辑字段
    private Integer delFlag;//del_flag  要么和数据库字段对应，要么使用驼峰命名法，mybatisplus默认开启

}
