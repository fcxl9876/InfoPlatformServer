/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.info.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.info.entity.InfoPassword;

/**
 * 密码信息DAO接口
 * @author fcxl9876
 * @version 2021-11-07
 */
@MyBatisDao
public interface InfoPasswordDao extends CrudDao<InfoPassword> {
	
}