package com.hui.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author Administrator
 *
 */
@Controller
public class IndexPageController {

	/**
	 * 跳转index主页
	 * @author Administrator
	 */
	@RequestMapping("/")
	public String gotoIndex() {
		return "index";	
	}
	
	/**
	 * 跳转新增商品板块
	 * @author Administrator
	 */
	@RequestMapping("item-add")
	public String itemAddModel() {
		return "item-add";
	}
	
	/**
	 * 跳转商品列表板块
	 * @author Administrator
	 */
	@RequestMapping("item-list")
	public String itemListModel() {
		return "item-list";
	}
	
	/**
	 * 跳转商品规格参数板块
	 * @author Administrator
	 */
	@RequestMapping("item-param-list")
	public String itemParamListModel() {
		return "item-param-list";
	}
	
}
