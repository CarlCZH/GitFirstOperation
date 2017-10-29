package com.hui.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.logger.log4j.Log4jLogger;
import com.hui.common.pojo.EasyUIDatagridResult;
import com.hui.common.utils.TaotaoResult;
import com.hui.service.ItemOperationService;
/**
 * 
 * @author Carl
 *
 */
@Controller
public class ItemListController {

	@Autowired
	private ItemOperationService itemOperationService;
	
	/**
	 * 商品列表的展示
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDatagridResult itemListDisplay(Integer page,Integer rows) {
		EasyUIDatagridResult result = itemOperationService.findAllItem(page, rows);
		return result;
	}
	
	/**
	 * 根据ids进行商品删除
	 */
	@RequestMapping("/rest/item/delete")
	@ResponseBody
	public TaotaoResult itemDelete(@RequestBody String params) {
		TaotaoResult result = itemOperationService.deleteItemByIds(params);
		return result;
	}
	
	/**
	 * 商品的下架
	 */
	@RequestMapping("/rest/item/instock")
	@ResponseBody
	public TaotaoResult itemXiaJia(@RequestBody String params) {
		TaotaoResult result = itemOperationService.updateItemDown(params);
		return result;
	}
	
	/**
	 * 商品的上架
	 */
	@RequestMapping("/rest/item/reshelf")
	@ResponseBody
	public TaotaoResult itemShangJia(@RequestBody String params) {
		TaotaoResult result = itemOperationService.updateItemUp(params);
		return result;
	}
}
