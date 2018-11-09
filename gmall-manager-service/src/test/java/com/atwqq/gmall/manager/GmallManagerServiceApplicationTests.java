package com.atwqq.gmall.manager;

import com.atwqq.gmall.manager.mapper.UserMapper;
import com.atwqq.gmall.manager.service.impl.CatalogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManagerServiceApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CatalogService catalogService;

    @Test
    public void catalogTest() {
        List<BaseCatalog1> allBaseCatalog1 = catalogService.getAllBaseCatalog1();
        log.info("一级分类信息：{}", allBaseCatalog1);
        List<BaseCatalog2> baseCatalog2ByC1id = catalogService.getBaseCatalog2ByC1id(allBaseCatalog1.get(0).getId());
        log.info("{} 的二级分类信息：{}", allBaseCatalog1.get(0), baseCatalog2ByC1id);
        List<BaseCatalog3> baseCatalog3ByC2id = catalogService.getBaseCatalog3ByC2id(baseCatalog2ByC1id.get(0).getId());
        log.info("{} 的三级分类信息：{}", baseCatalog2ByC1id.get(0), baseCatalog3ByC2id);
    }

    @Test
    public void del() {
        userMapper.deleteById(1L);
        System.out.println("删除完成");
    }

    @Test
    public void contextLoads() {
        for (User user : userMapper.selectList(null)) {
            System.out.println(user);
        }

        log.info("=================");
        User user = new User();
        user.setName("Jack");
        user.setAge(20);
        User userByNameAndAge = userMapper.getUserByNameAndAge(user);
        System.out.println(userByNameAndAge);
    }

}
