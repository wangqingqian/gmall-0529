package com.atwqq.gmall.manager;

import com.atwqq.gmall.SuperBean;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class BaseCatalog3 extends SuperBean {

    private String name;

    private Integer catalog2Id;

}
