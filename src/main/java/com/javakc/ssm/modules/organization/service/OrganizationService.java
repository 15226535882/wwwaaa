package com.javakc.ssm.modules.organization.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.base.util.CommonUtil;
import com.javakc.ssm.modules.org.tree.dao.OrgtreeDao;
import com.javakc.ssm.modules.org.tree.entity.OrgtreeEntity;
import com.javakc.ssm.modules.org.tree.service.OrgtreeService;
import com.javakc.ssm.modules.organization.dao.OrganizationDao;
import com.javakc.ssm.modules.organization.entity.OrganizationEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 数据字典模块逻辑层实现
 * @author javakc
 * @version 0.1
 */
@Service
@Transactional(readOnly = true)
public class OrganizationService extends BaseService<OrganizationDao, OrganizationEntity>{

    @Autowired
    private OrgtreeDao orgtreeDao;
    public Page<OrganizationEntity> queryPage(Page<OrganizationEntity> page, OrganizationEntity o) {
        o.setPage(page);

        List<OrganizationEntity> list=dao.findList(o);
        List<OrgtreeEntity> list1 = orgtreeDao.findList(null);
        for (OrganizationEntity or:list
        ) {
            String op=null;
            for (OrgtreeEntity orgtreeEntity:
                    list1) {

                if (or.getAhId().equals(orgtreeEntity.getId())){
                    or.setCity(orgtreeEntity.getName());
                    op=orgtreeEntity.getPid();
                    break;
                }
            }
            for (OrgtreeEntity orgtreeEntity:
                    list1) {
                if (op.equals(orgtreeEntity.getId())){
                    or.setProvince(orgtreeEntity.getName());
                    break;
                }

            }


        }
        Page<OrganizationEntity> po=page.setList(list);
        return po;

    }
}
