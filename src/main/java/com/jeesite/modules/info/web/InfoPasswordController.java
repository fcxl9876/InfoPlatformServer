/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.info.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.info.entity.InfoPassword;
import com.jeesite.modules.info.service.InfoPasswordService;

/**
 * 密码信息Controller
 * @author fcxl9876
 * @version 2021-11-07
 */
@Controller
@RequestMapping(value = "${adminPath}/info/infoPassword")
public class InfoPasswordController extends BaseController {

	@Autowired
	private InfoPasswordService infoPasswordService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public InfoPassword get(String id, boolean isNewRecord) {
		return infoPasswordService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("info:infoPassword:view")
	@RequestMapping(value = {"list", ""})
	public String list(InfoPassword infoPassword, Model model) {
		model.addAttribute("infoPassword", infoPassword);
		return "modules/info/infoPasswordList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("info:infoPassword:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<InfoPassword> listData(InfoPassword infoPassword, HttpServletRequest request, HttpServletResponse response) {
		infoPassword.setPage(new Page<>(request, response));
		Page<InfoPassword> page = infoPasswordService.findPage(infoPassword);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("info:infoPassword:view")
	@RequestMapping(value = "form")
	public String form(InfoPassword infoPassword, Model model) {
		model.addAttribute("infoPassword", infoPassword);
		return "modules/info/infoPasswordForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("info:infoPassword:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated InfoPassword infoPassword) {
		infoPasswordService.save(infoPassword);
		return renderResult(Global.TRUE, text("保存密码信息成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("info:infoPassword:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(InfoPassword infoPassword) {
		infoPasswordService.delete(infoPassword);
		return renderResult(Global.TRUE, text("删除密码信息成功！"));
	}
	
}