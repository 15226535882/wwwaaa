package com.javakc.ssm.modules.afterlog;


import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.afterlog.dao.AfterlogDao;
import com.javakc.ssm.modules.afterlog.entity.AfterlogEntity;
import com.javakc.ssm.modules.afterlog.service.AfterlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-shiro.xml"} )
public class TestQuary {

//    @Autowired
//    private AfterlogDao afterlogDao;
//    @Test
//    public  void  query1(){
//        AfterlogEntity entity = new AfterlogEntity();
//        List<AfterlogEntity> list = afterlogDao.findyanyun();
//        System.out.println(list.size());
//
//
//    }
@Autowired
private AfterlogService afterlogDao;
    @Test
    public  void  query1(){
        AfterlogEntity entity = new AfterlogEntity();
        Page<AfterlogEntity> page=new Page<>();
        page.setPageSize(3);
        Page<AfterlogEntity> list = afterlogDao.findAfterlog(page,entity);
        System.out.println(list.getCount());


    }
}
