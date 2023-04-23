package com.exreview.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exreview.lesson02.bo.UsedGoodsBO;
import com.exreview.lesson02.model.UsedGoods;

@RestController
public class UsedGoodsRestController {

	@Autowired
	private UsedGoodsBO userGoodsBO;
	
	@RequestMapping("/lesson02/ex01")
	//  http://localhost/lesson02/ex01
	public List<UsedGoods> ex01() {
		return userGoodsBO.getUsedGoodsList();
	}
}
