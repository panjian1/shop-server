package com.changyu.foryou.mapper;

import java.util.List;
import java.util.Map;

import com.changyu.foryou.model.GoodComment;

public interface FoodCommentMapper {
    int insert(GoodComment record);

    int insertSelective(GoodComment record);

	Long getCommentCountsById(Map<String, Object> paramMap);

	Integer getFoodCommentCount(Map<String, Object> paramMap);

	Float getAvageGrade(Map<String, Object> paramMap);

	List<GoodComment> getCommentsById(Map<String, Object> paramMap);

	List<GoodComment> getAllComments(Map<String, Object> paramMap);

	Integer deleteFoodComment(Map<String, Object> paramMap);

	Integer calCommentCount(Map<String, Object> paramMap);
}