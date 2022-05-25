package com.jeesite.modules.info.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.info.entity.InfoUser;

/**
 * 用户信息DAO接口
 * @author fcxl9876
 * @version 2022-05-25
 */
@MyBatisDao
public interface InfoUserDao extends CrudDao<InfoUser> {
	
}