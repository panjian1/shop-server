package com.changyu.foryou.serviceImpl;

import java.util.List;
import java.util.Map;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changyu.foryou.mapper.NewsMapper;
import com.changyu.foryou.model.News;
import com.changyu.foryou.model.SmallNews;
import com.changyu.foryou.service.NewsService;


@Service("/newsService")
public class NewsServiceImpl implements NewsService {
	private NewsMapper newsMapper;

	public NewsMapper getNewsMapper() {
		return newsMapper;
	}

	@Autowired
	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	public List<SmallNews> getSmallNews(Map<String,Object> map) {
		return newsMapper.getSmallNews(map);
	}

	public News getNewsById(String newsId) {
		AVQuery<News> query = AVObject.getQuery(News.class);
		News  news = null;
		try {
			news = query.get(newsId);
		} catch (AVException e) {
			e.printStackTrace();
		}
		return news;
	}

	public List<News> getPcAllNews() {
		AVQuery<News> query = AVObject.getQuery(News.class);
		List<News> result = null;
		try {
			 result = query.find();
		} catch (AVException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void addNews(News news) throws AVException{
       news.save();
	}

	@Override
	public void deleteById(String id) throws Exception{
		// 执行 CQL 语句实现更新一个 Todo 对象
		AVQuery.doCloudQuery("delete from news where objectId=?", id);
	}

	
}
