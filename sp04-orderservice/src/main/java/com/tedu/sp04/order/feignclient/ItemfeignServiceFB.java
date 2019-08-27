package com.tedu.sp04.order.feignclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;

@Component
public class ItemfeignServiceFB implements ItemFeignService{

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		if(Math.random()<0.5) {
			return JsonResult.ok().data(
					Arrays.asList(new Item[] {
				new Item(1,"缓存aaa",2),
				new Item(2,"缓存aaa",4),
				new Item(3,"缓存aaa",3),
				new Item(4,"缓存aaa",1),
				new Item(1,"缓存aaa",5)
			})
		 );
		}
		return JsonResult.err("无法获取订单商品列表");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		// TODO Auto-generated method stub
		return JsonResult.err("无法修改商产品库存");
	}
  
}
