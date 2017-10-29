package com.hui.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.common.pojo.EasyUIDatagridResult;
import com.hui.common.utils.TaotaoResult;
import com.hui.mapper.TbItemMapper;
import com.hui.pojo.TbItem;
import com.hui.pojo.TbItemExample;
import com.hui.service.ItemOperationService;

@Service
public class ItemOperationServiceImpl implements ItemOperationService {

	@Autowired
	private TbItemMapper tbItemMapper;

	// 查询所有商品信息
	@Override
	public EasyUIDatagridResult findAllItem(Integer page, Integer rows) {

		// 先进行pageHlper分页
		PageHelper.startPage(page, rows);

		// 进行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> itemLists = tbItemMapper.selectByExample(example);

		// 封装数据到EasyUIDatagridResult
		EasyUIDatagridResult result = new EasyUIDatagridResult();
		result.setRows(itemLists);

		// 统计总数量
		PageInfo<TbItem> info = new PageInfo<>(itemLists);
		long total = info.getTotal();
		result.setTotal(total);
		return result;
	}

	// 根据ids进行商品删除
	@Override
	public TaotaoResult deleteItemByIds(String params) {
		TaotaoResult result = new TaotaoResult();
		// 判空
		if (StringUtils.isEmpty(params)) {
			result.setStatus(400);
			return result;
		}
		// 截取字符串
		String substring = params.substring(4);
		// 将字符串进行分割
		String[] strs = substring.split("%2C");
		for (String str : strs) {
			long id = Long.parseLong(str);
			tbItemMapper.deleteByPrimaryKey(id);
		}
		result.setStatus(200);
		return result;
	}

	// 商品的下架
	@Override
	public TaotaoResult updateItemDown(String params) {
		TaotaoResult result = new TaotaoResult();
		TbItem tbItem = new TbItem();
		// 判空
		if (StringUtils.isEmpty(params)) {
			result.setStatus(400);
			return result;
		}
		// 截取字符串
		String substring = params.substring(4);
		// 将字符串进行分割
		String[] strs = substring.split("%2C");
		for (String str : strs) {
			long id = Long.parseLong(str);
			tbItem.setId(id);
			tbItem.setStatus((byte) 2);
			tbItemMapper.updateByPrimaryKeySelective(tbItem);
		}
		result.setStatus(200);
		return result;
	}

	// 商品的上架
	@Override
	public TaotaoResult updateItemUp(String params) {
		TaotaoResult result = new TaotaoResult();
		TbItem tbItem = new TbItem();
		// 判空
		if (StringUtils.isEmpty(params)) {
			result.setStatus(400);
			return result;
		}
		// 截取字符串
		String substring = params.substring(4);
		// 将字符串进行分割
		String[] strs = substring.split("%2C");
		for (String str : strs) {
			long id = Long.parseLong(str);
			tbItem.setId(id);
			tbItem.setStatus((byte) 1);
			tbItemMapper.updateByPrimaryKeySelective(tbItem);
		}
		result.setStatus(200);
		return result;
	}

}
