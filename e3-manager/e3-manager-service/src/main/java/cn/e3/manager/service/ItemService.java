package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

/*
 * Item Service接口
 */
public interface ItemService {
	
	//根据Id查询单个
	public TbItem findItemById(Long itemId);
}
