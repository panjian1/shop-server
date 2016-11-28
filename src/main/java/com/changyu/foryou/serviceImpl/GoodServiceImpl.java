package com.changyu.foryou.serviceImpl;

import java.util.List;
import java.util.Map;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changyu.foryou.mapper.GoodCategoryMapper;
import com.changyu.foryou.mapper.GoodCommentMapper;
import com.changyu.foryou.mapper.GoodMapper;
import com.changyu.foryou.mapper.GoodSpecialMapper;
import com.changyu.foryou.model.Good;
import com.changyu.foryou.model.GoodCategory;
import com.changyu.foryou.model.GoodComment;
import com.changyu.foryou.model.GoodSpecial;
import com.changyu.foryou.model.GoodSpecialKey;
import com.changyu.foryou.model.GoodWithSales;
import com.changyu.foryou.model.HomeCategory;
import com.changyu.foryou.model.ShortGood;
import com.changyu.foryou.model.ShortGoodWithIm;
import com.changyu.foryou.model.VeryShortGood;
import com.changyu.foryou.service.GoodService;

/**
 * 商品管理服务类（包括商品分类）
 * @author 张浩
 *2014/12/13
 */
@Service("/goodService")
public class GoodServiceImpl implements GoodService {

	public int deleteCategoryByPrimaryKey(Map<String,Object> paramMap) {
		return GoodCategoryMapper.deleteByPrimaryKey(paramMap);
	}

	public int insertCategorySelective(GoodCategory record) {
		return GoodCategoryMapper.insertSelective(record);
	}

	public GoodCategory selectCategoryByPrimaryKey(Map<String,Object> paramMap) {
		return GoodCategoryMapper.selectByPrimaryKey(paramMap);
	}

	public int updateCategoryByPrimaryKeySelective(GoodCategory record) {
		return GoodCategoryMapper.updateByPrimaryKeySelective(record);
	}

	public int deleteGoodByPrimaryKey(Map<String,Object> paramMap) {
		return GoodMapper.deleteByPrimaryKey(paramMap);
	}

	public int insertGoodSelective(Good record) {
		return GoodMapper.insertSelective(record);
	}

	public Good selectGoodByPrimaryKey(Map<String,Object> paramMap) {
		return GoodMapper.selectByPrimaryKey(paramMap);
	}

	public int updateGoodByPrimaryKeySelective(Good record) {
		return GoodMapper.updateByPrimaryKeySelective(record);
	}

	//获取商品一级分类
	public List<GoodCategory> getFirstCategory(Map<String,Object> paramMap) {
		AVQuery<GoodCategory> query = AVObject.getQuery(GoodCategory.class);
		query.whereEqualTo("parentId", paramMap.get(""));
		List<GoodCategory> result = null;
		try {
			result = query.find();
		} catch (AVException e) {
			e.printStackTrace();
		}
		return  result;

	}

//	//获取商品二级分类
//	public List<GoodCategory> getSecondCategories(Integer id) {
//		return GoodCategoryMapper.getSecondCategoryes(id);
//	}

	//根据商品分类，和商品标签查询商品
	public List<ShortGoodWithIm> selectGoods(Map<String,Object> paramMap) {

		return GoodMapper.selectGoods(paramMap);
	}

	public List<GoodSpecial> getGoodSpecial(Map<String,Object> paramMap) {
		return GoodSpecialMapper.getGoodSpecialByGoodId(paramMap);
	}

	//通过两个标签模糊查询（两个标签以空格隔开）
	public List<ShortGoodWithIm> selectGoodsByTwoTags(Map<String,Object> paramMap) {

		return GoodMapper.selectGoodsByTwoTags(paramMap);

	}

	public int insertSelective(GoodComment record) {
		return 0;
	}

	public Long getCommentCountsById(Map<String,Object> paramMap) {
		return GoodCommentMapper.getCommentCountsById(paramMap);
	}

	public List<GoodComment> getCommentInfoById(Map<String,Object> paramMap) {
		return GoodCommentMapper.getCommentsById(paramMap);
	}

	public List<Good> getAllGoods(Map<String,Object> paramMap) {
		return GoodMapper.getAllGoods(paramMap);
	}

	public Integer getGoodSpecialCount(Map<String,Object> paramMap) {
		return GoodSpecialMapper.getGoodSpecialCount(paramMap);
	}

	public String getSpecialName(Map<String,Object> paramMap) {
		return GoodSpecialMapper.getSpecialName(paramMap);
	}

	public List<GoodCategory> getAllGoodSecondCategories() {
		return GoodCategoryMapper.getAllGoodSecondCategories();
	}

	public List<GoodCategory> getAllGoodFirstCategories() {
		return GoodCategoryMapper.getAllGoodFirstCategories();
	}

	public int addGoodSpecial(GoodSpecial GoodSpecial) {
		return GoodSpecialMapper.addGoodSpecial(GoodSpecial);
	}

	public int getSpecialCount(Map<String,Object> paramMap) {
		return GoodSpecialMapper.getSpecialCount(paramMap);
	}

	//获取special_id的最大值
	public Integer getSpecialMax(Map<String,Object> paramMap) {
		return GoodSpecialMapper.getSpecialMax(paramMap);
	}

	public List<GoodComment> getAllComments(Map<String,Object> paramMap) {
		return GoodCommentMapper.getAllComments(paramMap);
	}

	public Integer insertGoodComment(GoodComment GoodComment) {
		return GoodCommentMapper.insertSelective(GoodComment);
	}

	public List<ShortGood> getGoodListFresh(Map<String,Object> paramMap) {
		return GoodMapper.getGoodListFresh(paramMap);
	}

	public List<ShortGood> getGoodListWelcome(Map<String,Object> paramMap) {
		return GoodMapper.getGoodListWelcome(paramMap);
	}

	public List<ShortGood> getGoodListDiscount(Map<String,Object> paramMap) {
		return GoodMapper.getGoodListDiscount(paramMap);
	}

	public Integer changeGoodCount(Map<String,Object> paramMap) {
		int flag=0;
		//flag= GoodSpecialMapper.changeGoodCount(paramMap);
		flag=GoodMapper.changeGoodNumber(paramMap);
		return flag;
	}

	public Integer deleteGoodCommentById(Map<String,Object> paramMap) {
		return GoodCommentMapper.deleteGoodComment(paramMap);
	}

	public Float getAvageGrade(Map<String,Object> paramMap) {
		return GoodCommentMapper.getAvageGrade(paramMap);
	}

	public void deleteGoodSpecial(GoodSpecial GoodSpecial) {
		GoodSpecialKey GoodSpecialKey=GoodSpecial;

		 GoodSpecialMapper.deleteByPrimaryKey(GoodSpecialKey); //删除商品的某一口味
	}

	public void updateGoodSpecial(GoodSpecial GoodSpecial) {
		GoodSpecialMapper.updateByPrimaryKey(GoodSpecial);
	}

	public Integer getGoodCommentCount(Map<String, Object> paramMap) {
		return GoodCommentMapper.getGoodCommentCount(paramMap);
	}

	public List<VeryShortGood> selectHomeGood(Map<String, Object> paramMap)
	{
		return GoodMapper.selectHomeGood(paramMap);
	}

	public List<GoodCategory> getAllGoodCategories(Map<String, Object> paramMap)
	{
		return GoodCategoryMapper.getAllGoodCategories(paramMap);
	}

	@Override
	public List<HomeCategory> getHomeCategoryInfo(Map<String, Object> paramMap) {
		return GoodCategoryMapper.getHomeCategoryInfo(paramMap);
	}

	@Override
	public Integer getAllCategoryCount() {

		return GoodCategoryMapper.getAllCategoryCount();
	}

	@Override
	public Integer uploadHomeGoodByGoodId(Map<String, Object> paramMap) {
		return GoodMapper.uploadHomeGoodByGoodId(paramMap);
	}

	@Override
	public Integer updateInfoByGoodId(Map<String, Object> paramMap) {
		return GoodMapper.updateInfoByGoodId(paramMap);
	}

	@Override
	public Integer cancelRecommend(Map<String, Object> paramMap) {
		return GoodMapper.cancelRecommend(paramMap);
	}

	@Override
	public Integer calCommentCount(Map<String, Object> paramMap) {
		return GoodCommentMapper.calCommentCount(paramMap);
	}

	@Override
	public Integer addCategoryWhenAddCampus(Map<String, Object> paramMap) {
		return GoodCategoryMapper.addCategoryWhenAddCampus(paramMap);
	}

	@Override
	public List<GoodWithSales> getTopFive(Map<String, Object> paramMap) {
		return GoodMapper.getTopFive(paramMap);
	}

	@Override
	public Integer addGoodCountById(Map<String, Object> paramMap) {
		return GoodMapper.addGoodCountById(paramMap);
	}

	@Override
	public Integer addGoodCount(Map<String, Object> paramMap) {
		return GoodMapper.addGoodCount(paramMap);
	}

	@Override
	public String getGoodHomeImage(Map<String, Object> paramMap) {
		return GoodMapper.getGoodHomeImage(paramMap);
	}

	@Override
	public String getDetailImg(Map<String, Object> paramMap) {
		return GoodMapper.getDetailImg(paramMap);
	}
	
}

