package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

/*
 * Item Controller
 * 
 * @RestController 结合了 @Controller 与 @ResponseBody
 */
@RestController
public class ItemController {
	
	//依赖注入Service
	@Autowired
	private ItemService itemService;
	
	//根据查询单个Item的方法
	@RequestMapping("item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		//调用service查询
		TbItem item = itemService.findItemById(itemId);
		return item;
	}

}
