package com.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.itcast.ssm.mapper.ItemsMapper;
import com.itcast.ssm.mapper.ItemsMapperCustomer;
import com.itcast.ssm.po.Items;
import com.itcast.ssm.po.ItemsCustomer;
import com.itcast.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustomer itemsMapperCustomer;
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<ItemsCustomer> findItemsList() throws Exception {

		return itemsMapperCustomer.findItemsList();
	}

	@Override
	public ItemsCustomer findItemsById(Integer id) throws Exception {
		Items items = itemsMapper.selectByPrimaryKey(id);
		// 业务处理
		// ...
		ItemsCustomer itemsCustomer = new ItemsCustomer();
		// 将items的内容拷贝到itemsCustomer
		BeanUtils.copyProperties(items, itemsCustomer);
		return itemsCustomer;
	}

	@Override
	public void updateItems(Integer id, ItemsCustomer itemsCustomer) {
		// 添加业务校验
		// 校验id是否为null，如果为空抛异常

		// 更新商品信息
		itemsCustomer.setId(id);

		// 更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括大文本字段
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustomer);

	}

}
