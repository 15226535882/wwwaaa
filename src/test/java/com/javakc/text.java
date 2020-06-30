package com.javakc;

import com.javakc.ssm.modules.organization.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.service.OrganizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class text {
    @Autowired
    public OrganizationService organizationService;
    @Test
    public void text1() {
        OrganizationEntity o=new OrganizationEntity();
        List<OrganizationEntity> list = organizationService.findList(o);
        System.out.println(list);


    }
}
