package com.javakc.ssm.modules.organization.controller;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.modules.organization.entity.OrganizationEntity;
import com.javakc.ssm.modules.organization.service.OrganizationService;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 数据字典表现层实现
 * @author javakc
 * @version v0.1
 */
@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {

    @Autowired
    protected OrganizationService organizationService;

    @RequiresPermissions("organization:queryPage")
    @RequestMapping(value="/query")
    public Page<OrganizationEntity> QueryPage(Page<OrganizationEntity> page,OrganizationEntity o){
        return organizationService.queryPage(page,o);
    }

}
