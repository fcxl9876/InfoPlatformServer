/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.info.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.info.entity.InfoPassword;
import com.jeesite.modules.info.dao.InfoPasswordDao;

/**
 * 密码信息Service
 * @author fcxl9876
 * @version 2021-11-07
 */
@Service
@Transactional(readOnly=true)
public class InfoPasswordService extends CrudService<InfoPasswordDao, InfoPassword> {
	
	/**
	 * 获取单条数据
	 * @param infoPassword
	 * @return
	 */
	@Override
	public InfoPassword get(InfoPassword infoPassword) {
		return super.get(infoPassword);
	}
	
	/**
	 * 查询分页数据
	 * @param infoPassword 查询条件
	 * @param infoPassword.page 分页对象
	 * @return
	 */
	@Override
	public Page<InfoPassword> findPage(InfoPassword infoPassword) {
		return super.findPage(infoPassword);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param infoPassword
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(InfoPassword infoPassword) {
		super.save(infoPassword);
	}
	
	/**
	 * 更新状态
	 * @param infoPassword
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(InfoPassword infoPassword) {
		super.updateStatus(infoPassword);
	}
	
	/**
	 * 删除数据
	 * @param infoPassword
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(InfoPassword infoPassword) {
		super.delete(infoPassword);
	}
	
}