package com.itcast.ssm.po;

/**
 * 商品包装对象
 * @author chenhongxin
 *
 */
public class ItemsQueryVo {

	// 商品信息
	private Items items;
	// 为了系统可扩展性，对原始生成的po对象分装
	private ItemsCustomer itemsCustomer;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustomer getItemsCustomer() {
		return itemsCustomer;
	}

	public void setItemsCustomer(ItemsCustomer itemsCustomer) {
		this.itemsCustomer = itemsCustomer;
	}

}
