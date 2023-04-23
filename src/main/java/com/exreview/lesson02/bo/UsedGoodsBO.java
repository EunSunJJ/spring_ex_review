package com.exreview.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exreview.lesson02.dao.UsedGoodsMapper;
import com.exreview.lesson02.model.UsedGoods;

@Service
public class UsedGoodsBO {

	@Autowired
	private UsedGoodsMapper userGoodsMapper;
	
	public List<UsedGoods> getUsedGoodsList() {
		return userGoodsMapper.selectUsedGoodsList();
	}
}
