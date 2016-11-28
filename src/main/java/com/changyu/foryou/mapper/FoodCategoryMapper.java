package com.changyu.foryou.mapper;

import java.util.List;
import java.util.Map;

import com.changyu.foryou.model.GoodCategory;
import com.changyu.foryou.model.HomeCategory;

public interface FoodCategoryMapper {
    int deleteByPrimaryKey(Map<String, Object> paramMap);

    int insert(GoodCategory record);

    int insertSelective(GoodCategory record);

    GoodCategory selectByPrimaryKey(Map<String, Object> paramMap);

    int updateByPrimaryKeySelective(GoodCategory record);

    int updateByPrimaryKey(GoodCategory record);

	List<GoodCategory> getFirstCategory(Map<String, Object> paramMap);

	//List<FoodCategory> getSecondCategoryes(@Param(value="categoryId")Integer id);

	List<GoodCategory> getAllFoodSecondCategories();

	List<GoodCategory> getAllFoodFirstCategories();

	List<HomeCategory> getHomeCategoryInfo(Map<String, Object> paramMap);

	List<GoodCategory> getAllFoodCategories(Map<String, Object> paramMap);
	
	int getAllCategoryCount();
	
	Integer addCategoryWhenAddCampus(Map<String, Object> paramMap);
}