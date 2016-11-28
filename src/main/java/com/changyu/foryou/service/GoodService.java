package com.changyu.foryou.service;

import java.util.List;
import java.util.Map;

import com.changyu.foryou.model.Good;
import com.changyu.foryou.model.GoodCategory;
import com.changyu.foryou.model.GoodComment;
import com.changyu.foryou.model.GoodSpecial;
import com.changyu.foryou.model.GoodWithSales;
import com.changyu.foryou.model.HomeCategory;
import com.changyu.foryou.model.ShortGood;
import com.changyu.foryou.model.ShortGoodWithIm;
import com.changyu.foryou.model.VeryShortGood;

public interface GoodService {
	int deleteCategoryByPrimaryKey(Map<String, Object> paramMap);

	int insertCategorySelective(GoodCategory record);

	GoodCategory selectCategoryByPrimaryKey(Map<String, Object> paramMap);

	int updateCategoryByPrimaryKeySelective(GoodCategory record);

	int deleteGoodByPrimaryKey(Map<String, Object> paramMap);

	int insertGoodSelective(Good record);

	Good selectGoodByPrimaryKey(Map<String, Object> paramMap);

	int updateGoodByPrimaryKeySelective(Good record);

	List<GoodCategory>getFirstCategory(Map<String, Object> paramMap);

	//List<GoodCategory> getSecondCategories(Integer id);


	List<GoodSpecial> getGoodSpecial(Map<String, Object> paramMap);

	int insertSelective(GoodComment record);

	Long getCommentCountsById(Map<String, Object> paramMap);

	List<Good> getAllGoods(Map<String, Object> paramMap);

	Integer getGoodSpecialCount(Map<String, Object> paramMap);

	String getSpecialName(Map<String, Object> paramMap);

//	List<GoodCategory> getAllGoodSecondCategories();
//
//	List<GoodCategory> getAllGoodFirstCategories();

	int getSpecialCount(Map<String, Object> paramMap);

	int addGoodSpecial(GoodSpecial GoodSpecial);

	Integer getSpecialMax(Map<String, Object> paramMap);

	Integer getGoodCommentCount(Map<String, Object> paramMap);

	Integer insertGoodComment(GoodComment GoodComment);

	List<ShortGood> getGoodListDiscount(Map<String, Object> paramMap);

	List<ShortGood> getGoodListFresh(Map<String, Object> paramMap);

	List<ShortGood> getGoodListWelcome(Map<String, Object> paramMap);

	Integer changeGoodCount(Map<String, Object> paramMap);

	Float getAvageGrade(Map<String, Object> paramMap);

	void deleteGoodSpecial(GoodSpecial GoodSpecial);

	void updateGoodSpecial(GoodSpecial GoodSpecial);

	List<ShortGoodWithIm> selectGoods(Map<String, Object> paramMap);

	List<ShortGoodWithIm> selectGoodsByTwoTags(Map<String, Object> paramMap);

	List<GoodComment> getCommentInfoById(Map<String, Object> paramMap);

	Object getAllComments(Map<String, Object> paramMap);

	Integer deleteGoodCommentById(Map<String, Object> paramMap);

	List<VeryShortGood> selectHomeGood(Map<String, Object> paramMap);

	List<GoodCategory> getAllGoodCategories(Map<String,Object> paramMap);

	List<HomeCategory> getHomeCategoryInfo(Map<String, Object> paramMap);

	//void deleteGoodByParentCategory(String categoryId);
	
	Integer getAllCategoryCount();
	
	Integer uploadHomeGoodByGoodId(Map<String, Object> paramMap);
	
	Integer updateInfoByGoodId(Map<String, Object> paramMap);
	
	Integer cancelRecommend(Map<String, Object> paramMap);

	Integer calCommentCount(Map<String, Object> paramMap);
	
	public Integer addCategoryWhenAddCampus(Map<String, Object> paramMap);
	
	List<GoodWithSales> getTopFive(Map<String, Object> paramMap);
	
	Integer addGoodCountById(Map<String, Object> paramMap);//添加库存
	
	Integer addGoodCount(Map<String, Object> paramMap);//添加库存

	String getGoodHomeImage(Map<String, Object> paramMap);  //获取原来的首页图片

	String getDetailImg(Map<String, Object> paramMap);   //获取详情图片
}
