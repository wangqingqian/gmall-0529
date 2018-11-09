package com.atwqq.gmall.manager;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 17:07
 */
@Data
public class SuperBean implements Serializable {
    @TableId(type = IdType.AUTO)//用@TableId注解用来标注主键自增
    private Integer id;
}
