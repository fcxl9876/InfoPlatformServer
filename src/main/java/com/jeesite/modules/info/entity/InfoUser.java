package com.jeesite.modules.info.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 用户信息Entity
 * @author fcxl9876
 * @version 2022-05-25
 */
@Table(name="info_user", alias="a", label="用户信息信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="username", attrName="username", label="用户名", queryType=QueryType.LIKE),
		@Column(name="password", attrName="password", label="密码", isQuery=false),
		@Column(name="status", attrName="status", label="用户状态，1-正常，0-停用", isUpdate=false),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
		@Column(name="del_flag", attrName="delFlag", label="删除标记，0-正常，1-删除", isUpdate=false, isQuery=false),
	}, orderBy="a.id DESC"
)
public class InfoUser extends DataEntity<InfoUser> {
	
	private static final long serialVersionUID = 1L;
	private String username;		// 用户名
	private String password;		// 密码
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间
	private String delFlag;		// 删除标记，0-正常，1-删除
	
	public InfoUser() {
		this(null);
	}
	
	public InfoUser(String id){
		super(id);
	}
	
	@NotBlank(message="用户名不能为空")
	@Size(min=0, max=100, message="用户名长度不能超过 100 个字符")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@NotBlank(message="密码不能为空")
	@Size(min=0, max=100, message="密码长度不能超过 100 个字符")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}