package com.changyu.foryou.service;

import java.util.List;
import java.util.Map;

import com.avos.avoscloud.AVException;
import com.changyu.foryou.model.News;
import com.changyu.foryou.model.SmallNews;


public interface NewsService {

	List<SmallNews> getSmallNews(Map<String,Object> map);

	News getNewsById(String newsId);

	List<News> getPcAllNews();

	void addNews(News news) throws AVException;

	void deleteById(String id) throws Exception;

}
