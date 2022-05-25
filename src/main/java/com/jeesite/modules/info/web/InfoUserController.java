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
import com.jeesite.modules.info.entity.InfoUser;
import com.jeesite.modules.info.service.InfoUserService;

/**
 * 用户信息Controller
 * @author fcxl9876
 * @version 2022-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/info/infoUser")
public class InfoUserController extends BaseController {

	@Autowired
	private InfoUserService infoUserService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public InfoUser get(String id, boolean isNewRecord) {
		return infoUserService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("info:infoUser:view")
	@RequestMapping(value = {"list", ""})
	public String list(InfoUser infoUser, Model model) {
		model.addAttribute("infoUser", infoUser);
		return "modules/info/infoUserList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("info:infoUser:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<InfoUser> listData(InfoUser infoUser, HttpServletRequest request, HttpServletResponse response) {
		infoUser.setPage(new Page<>(request, response));
		Page<InfoUser> page = infoUserService.findPage(infoUser);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("info:infoUser:view")
	@RequestMapping(value = "form")
	public String form(InfoUser infoUser, Model model) {
		model.addAttribute("infoUser", infoUser);
		return "modules/info/infoUserForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("info:infoUser:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated InfoUser infoUser) {
		infoUserService.save(infoUser);
		return renderResult(Global.TRUE, text("保存用户信息成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("info:infoUser:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(InfoUser infoUser) {
		infoUserService.delete(infoUser);
		return renderResult(Global.TRUE, text("删除用户信息成功！"));
	}
	
}