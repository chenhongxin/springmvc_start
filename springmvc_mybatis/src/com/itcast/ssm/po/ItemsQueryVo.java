package com.itcast.ssm.po;

/**
 * ��Ʒ��װ����
 * @author chenhongxin
 *
 */
public class ItemsQueryVo {

	// ��Ʒ��Ϣ
	private Items items;
	// Ϊ��ϵͳ����չ�ԣ���ԭʼ���ɵ�po�����װ
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
