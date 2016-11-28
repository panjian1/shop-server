package com.changyu.foryou.mapper;

import java.util.List;
import java.util.Map;

import com.changyu.foryou.model.Good;
import com.changyu.foryou.model.GoodWithSales;
import com.changyu.foryou.model.ShortGood;
import com.changyu.foryou.model.ShortGoodWithIm;
import com.changyu.foryou.model.VeryShortGood;

public interface FoodMapper {
    int deleteByPrimaryKey(Map<String, Object> paramMap);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Map<String, Object> paramMap);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

	List<Good> getAllFoods(Map<String, Object> paramMap);        //web管理端获取所有的食品

	List<ShortGood> getFoodListDiscount(Map<String, Object> paramMap);   //获取打折商品
 
	List<ShortGood> getFoodListFresh(Map<String, Object> paramMap);      //获取新品食品

	List<ShortGood> getFoodListWelcome(Map<String, Object> paramMap);   //获取受欢迎商品


	List<ShortGoodWithIm> selectFoods(Map<String, Object> paramMap);

	List<ShortGoodWithIm> selectFoodsByTwoTags(Map<String, Object> paramMap);

	int changeFoodNumber(Map<String, Object> paramMap);   //更新销量和减少库存

	List<VeryShortGood> selectHomeFood(Map<String, Object> paramMap);

	Integer uploadHomeFoodByFoodId(Map<String, Object> paramMap);//上传推送到首页的食品大图
	
	Integer updateInfoByFoodId(Map<String, Object> paramMap);//更新食品详情图片
	
	Integer cancelRecommend(Map<String, Object> paramMap);//取消推荐
	
	List<GoodWithSales> getTopFive(Map<String, Object> paramMap);
	
	Integer addFoodCountById(Map<String, Object> paramMap);//添加库存
	
	Integer addFoodCount(Map<String, Object> paramMap);

	String getFoodHomeImage(Map<String, Object> paramMap);

	String getDetailImg(Map<String, Object> paramMap);   //获取食品详情图片
}