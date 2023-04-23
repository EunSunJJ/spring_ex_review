package com.exreview.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exreview.lesson02.model.UsedGoods;

@Repository
public interface UsedGoodsMapper {

	public List<UsedGoods> selectUsedGoodsList();
}
