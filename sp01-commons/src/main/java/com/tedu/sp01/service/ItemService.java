package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {

	/**
	 * 通过订单ID获取商品列表
	 * @param orderID
	 * @return
	 */
	List<Item> getItems(String orderID);
	/**
	 * 在保存订单是减少商品库存
	 * @param lise
	 */
	void decreaseNumbers(List<Item> list);
}
