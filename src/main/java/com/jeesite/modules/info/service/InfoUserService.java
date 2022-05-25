package com.jeesite.modules.info.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.info.entity.InfoUser;
import com.jeesite.modules.info.dao.InfoUserDao;

/**
 * 用户信息Service
 * @author fcxl9876
 * @version 2022-05-25
 */
@Service
@Transactional(readOnly=true)
public class InfoUserService extends CrudService<InfoUserDao, InfoUser> {
	
	/**
	 * 获取单条数据
	 * @param infoUser
	 * @return
	 */
	@Override
	public InfoUser get(InfoUser infoUser) {
		return super.get(infoUser);
	}
	
	/**
	 * 查询分页数据
	 * @param infoUser 查询条件
	 * @param infoUser.page 分页对象
	 * @return
	 */
	@Override
	public Page<InfoUser> findPage(InfoUser infoUser) {
		return super.findPage(infoUser);
	}
	
	/**
	 * 查询列表数据
	 * @param infoUser
	 * @return
	 */
	@Override
	public List<InfoUser> findList(InfoUser infoUser) {
		return super.findList(infoUser);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param infoUser
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(InfoUser infoUser) {
		super.save(infoUser);
	}
	
	/**
	 * 更新状态
	 * @param infoUser
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(InfoUser infoUser) {
		super.updateStatus(infoUser);
	}
	
	/**
	 * 删除数据
	 * @param infoUser
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(InfoUser infoUser) {
		super.delete(infoUser);
	}
	
}