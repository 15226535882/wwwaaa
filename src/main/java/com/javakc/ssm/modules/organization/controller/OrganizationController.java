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


    @RequestMapping(value="/query")
    public ModelAndView query(OrganizationEntity entity, ModelAndView model,
                              HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        model.addObject("page", organizationService.queryPage(new Page<OrganizationEntity>(request, response), entity));
        model.addObject("entity", entity);
        model.setViewName("organization/list");
        return model;
    }

    @RequestMapping(value="/save")
    public String Save(OrganizationEntity o){
        organizationService.save(o);
        return "redirect:/organization/query.do";
    }
    @RequestMapping(value="/update")
    public String Update(String id,ModelMap modelMap){
        modelMap.addAttribute("update",organizationService.get(id));
        return "redirect:/organization/query.do";
    }

}
