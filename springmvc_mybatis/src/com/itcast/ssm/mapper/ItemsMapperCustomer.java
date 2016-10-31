package com.itcast.ssm.mapper;

import java.util.List;

import com.itcast.ssm.po.ItemsCustomer;

public interface ItemsMapperCustomer {

	public List<ItemsCustomer> findItemsList() throws Exception;
	
}
