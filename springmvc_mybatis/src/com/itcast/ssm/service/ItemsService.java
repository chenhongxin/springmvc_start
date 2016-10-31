package com.itcast.ssm.service;

import java.util.List;

import com.itcast.ssm.po.ItemsCustomer;

public interface ItemsService {

	public List<ItemsCustomer> findItemsList() throws Exception;

	// ����id��ѯ��Ʒ��Ϣ
	public ItemsCustomer findItemsById(Integer id) throws Exception;

	// �޸���Ʒ��Ϣ
	public void updateItems(Integer id, ItemsCustomer itemsCustomer);
}
