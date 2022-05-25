/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.info.entity;

import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 密码信息Entity
 * @author fcxl9876
 * @version 2021-11-07
 */
@Table(name="info_password", alias="a", label="密码信息信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="platform", attrName="platform", label="平台", queryType=QueryType.LIKE),
		@Column(name="username", attrName="username", label="用户名", queryType=QueryType.LIKE),
		@Column(name="password", attrName="password", label="密码", isQuery=false),
		@Column(name="email", attrName="email", label="电子邮箱"),
		@Column(name="mobile_phone", attrName="mobilePhone", label="手机号"),
		@Column(name="question1", attrName="question1", label="密保问题1"),
		@Column(name="answer1", attrName="answer1", label="答案1", isQuery=false),
		@Column(name="question2", attrName="question2", label="密保问题2"),
		@Column(name="answer2", attrName="answer2", label="答案2", isQuery=false),
		@Column(name="question3", attrName="question3", label="密保问题3"),
		@Column(name="answer3", attrName="answer3", label="答案3", isQuery=false),
		@Column(name="belong_to", attrName="belongTo", label="属于用户"),
		@Column(name="create_time", attrName="createTime", label="创建时间"),
		@Column(name="update_time", attrName="updateTime", label="更新时间"),
		@Column(name="del_flag", attrName="delFlag", label="删除标记，0-正常，1-删除", isUpdate=false, isQuery=false),
	}, orderBy="a.id DESC"
)
public class InfoPassword extends DataEntity<InfoPassword> {
	
	private static final long serialVersionUID = 1L;
	private String platform;		// 平台
	private String username;		// 用户名
	private String password;		// 密码
	private String email;		// 电子邮箱
	private String mobilePhone;		// 手机号
	private String question1;		// 密保问题1
	private String answer1;		// 答案1
	private String question2;		// 密保问题2
	private String answer2;		// 答案2
	private String question3;		// 密保问题3
	private String answer3;		// 答案3
	private String belongTo;		// 属于用户
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间
	private String delFlag;		// 删除标记，0-正常，1-删除
	
	public InfoPassword() {
		this(null);
	}

	public InfoPassword(String id){
		super(id);
	}
	
	@NotBlank(message="平台不能为空")
	@Length(min=0, max=100, message="平台长度不能超过 100 个字符")
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	@NotBlank(message="用户名不能为空")
	@Length(min=0, max=100, message="用户名长度不能超过 100 个字符")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@NotBlank(message="密码不能为空")
	@Length(min=0, max=100, message="密码长度不能超过 100 个字符")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Length(min=0, max=100, message="电子邮箱长度不能超过 100 个字符")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Length(min=0, max=100, message="手机号长度不能超过 100 个字符")
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	@Length(min=0, max=100, message="密保问题1长度不能超过 100 个字符")
	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	
	@Length(min=0, max=100, message="答案1长度不能超过 100 个字符")
	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	
	@Length(min=0, max=100, message="密保问题2长度不能超过 100 个字符")
	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	
	@Length(min=0, max=100, message="答案2长度不能超过 100 个字符")
	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
	@Length(min=0, max=100, message="密保问题3长度不能超过 100 个字符")
	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	
	@Length(min=0, max=100, message="答案3长度不能超过 100 个字符")
	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	
	@NotBlank(message="属于用户不能为空")
	@Length(min=0, max=100, message="属于用户长度不能超过 100 个字符")
	public String getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(String belongTo) {
		this.belongTo = belongTo;
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