package com.javakc.ssm.modules.afterlog.service;

import com.javakc.ssm.base.page.Page;
import com.javakc.ssm.base.service.BaseService;
import com.javakc.ssm.base.util.CommonUtil;
import com.javakc.ssm.modules.afterlog.dao.AfterlogDao;
import com.javakc.ssm.modules.afterlog.entity.AfterlogEntity;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//import com.javakc.ssm.base.util.CommonUtil;


/**
 * 售后日志逻辑层实现
 */
@Service
@Transactional(readOnly = true)
public class AfterlogService extends BaseService<AfterlogDao, AfterlogEntity> {

    @Autowired
    private AfterlogDao afterlogDao;
    public Page<AfterlogEntity> findAfterlog(Page<AfterlogEntity> page, AfterlogEntity entity){
        // 设置分页参数
		entity.setPage(page);
//		// 执行分页查询
        List<AfterlogEntity> entity1 = afterlogDao.findList(entity);

        page.setList(afterlogDao.findList(entity));

		return page;
    }


    //    	@Transactional(readOnly = false)
//	public void save(AfterlogEntity entity)
//	{
//        afterlogDao.
//
//	}



}
//
//	@Autowired
//	private DictionaryDao dictionaryDao;
//
//	public Page<DictionaryEntity> findDictionary(Page<DictionaryEntity> page, DictionaryEntity entity) {
//		// 设置分页参数
//		entity.setPage(page);
//		// 执行分页查询
//		page.setList(dictionaryDao.findList(entity));
//		return page;
//	}
//
//	@Transactional(readOnly = false)
//	public void save(DictionaryEntity entity, String[] code, String[] val)
//	{
//		for(int i=0;i<code.length;i++)
//		{
//			entity.setDataId(CommonUtil.uuid());
//			entity.setDataCode(code[i]);
//			entity.setDataVal(val[i]);
//			dictionaryDao.insert(entity);
//		}
//	}
//
//}
