package com.hui.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * datagrid插件要求的数据格式
 */
public class EasyUIDatagridResult implements Serializable{

	private static final long serialVersionUID = 1L;
	//总数
	private long total;
	//内容
	private List<?> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
	
}
