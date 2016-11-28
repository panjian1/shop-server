package com.changyu.foryou.mapper;

import java.util.List;
import java.util.Map;

import com.changyu.foryou.model.GoodSpecial;
import com.changyu.foryou.model.FoodSpecialKey;

public interface FoodSpecialMapper {
    int deleteByPrimaryKey(FoodSpecialKey key);

    int insert(GoodSpecial record);

    int insertSelective(GoodSpecial record);

    GoodSpecial selectByPrimaryKey(FoodSpecialKey key);

    int updateByPrimaryKeySelective(GoodSpecial record);

    int updateByPrimaryKey(GoodSpecial record);

	List<GoodSpecial> getFoodSpecialByFoodId(Map<String, Object> paramMap);

	String getSpecialName(Map<String, Object> paramMap);

	int addFoodSpecial(GoodSpecial foodSpecial);

	int getSpecialCount(Map<String, Object> paramMap);

	Integer getSpecialMax(Map<String, Object> paramMap);

	int changeFoodCount(Map<String, Object> paramMap);

	Integer getFoodSpecialCount(Map<String, Object> paramMap);
}