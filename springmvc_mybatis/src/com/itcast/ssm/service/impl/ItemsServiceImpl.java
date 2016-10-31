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
		// ҵ����
		// ...
		ItemsCustomer itemsCustomer = new ItemsCustomer();
		// ��items�����ݿ�����itemsCustomer
		BeanUtils.copyProperties(items, itemsCustomer);
		return itemsCustomer;
	}

	@Override
	public void updateItems(Integer id, ItemsCustomer itemsCustomer) {
		// ���ҵ��У��
		// У��id�Ƿ�Ϊnull�����Ϊ�����쳣

		// ������Ʒ��Ϣ
		itemsCustomer.setId(id);

		// ������Ʒ��Ϣʹ��updateByPrimaryKeyWithBLOBs����id����items���������ֶΣ��������ı��ֶ�
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustomer);

	}

}
