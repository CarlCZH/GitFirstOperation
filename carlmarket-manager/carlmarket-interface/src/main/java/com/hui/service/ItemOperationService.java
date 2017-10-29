package com.hui.service;

import com.hui.common.pojo.EasyUIDatagridResult;
import com.hui.common.utils.TaotaoResult;

public interface ItemOperationService {

	/**
	 * 查询所有商品信息
	 */
	EasyUIDatagridResult findAllItem(Integer page,Integer rows); 
	
	/**
	 * 根据ids进行商品删除
	 */
	TaotaoResult deleteItemByIds(String params);
	
	/**
	 * 商品的下架
	 */
	TaotaoResult updateItemDown(String params);
	
	/**
	 * 商品的上架
	 */
	TaotaoResult updateItemUp(String params);
}
