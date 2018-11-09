package com.atwqq.gmall.manager.mapper;

import com.atwqq.gmall.manager.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author wangqingqian
 * @date 2018/11/9 - 11:41
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 在mapper文件中映射这个方法
     * @param user
     * @return
     */
    public User getUserByNameAndAge (User user);
}
