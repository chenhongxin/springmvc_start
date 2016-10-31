package com.itcast.ssm.service;

import java.util.List;

import com.itcast.ssm.po.ItemsCustomer;

public interface ItemsService {

	public List<ItemsCustomer> findItemsList() throws Exception;

	// 根据id查询商品信息
	public ItemsCustomer findItemsById(Integer id) throws Exception;

	// 修改商品信息
	public void updateItems(Integer id, ItemsCustomer itemsCustomer);
}
