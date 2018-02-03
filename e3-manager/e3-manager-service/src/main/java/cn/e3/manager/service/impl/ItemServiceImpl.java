package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;
/*
 * Item Service实现类
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	//依赖注入商品mapper接口代理对象
	@Autowired
	private TbItemMapper itemMapper;
	
	//通过Id查询单个
	@Override
	public TbItem findItemById(Long itemId) {
		TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

}
