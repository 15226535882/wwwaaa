//package com.javakc.ssm.modules.afterlog.service;
//
//import com.javakc.ssm.base.page.Page;
//import com.javakc.ssm.base.service.BaseService;
//import com.javakc.ssm.base.util.CommonUtil;
//import com.javakc.ssm.modules.work.dao.DictionaryDao;
//import com.javakc.ssm.modules.work.entity.DictionaryEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * 数据字典模块逻辑层实现
// * @author javakc
// * @version 0.1
// */
//@Service
//@Transactional(readOnly = true)
//public class DictionaryService extends BaseService<DictionaryDao, DictionaryEntity>{
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
