package com.changyu.foryou.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;
import com.changyu.foryou.model.Sellers;
import com.changyu.foryou.service.SellerService;

/**
 * 商家账号管理
 * @author xiaowei
 *
 */
@Service("sellerService")
public class SellerServiceImpl implements SellerService {

	public Sellers selectByCampusAdmin(String adminName){
		AVQuery<Sellers> query = AVObject.getQuery(Sellers.class);
		query.whereEqualTo("adminName", adminName);
		List<Sellers> results = null;
		try {
			results = query.find();
		} catch (AVException e) {
			e.printStackTrace();
			return null;
		}
		if(results!=null && results.size() == 1){
			return results.get(0);
		}
		return null;
	}


	//TODO 更新上次登录时间
	public void updateLastLoginTime(Date date, String adminName) {

		AVQuery<Sellers> query = AVObject.getQuery(Sellers.class);
		query.whereEqualTo("adminName", adminName);
		List<Sellers> results = null;
		try {
			results = query.find();
		} catch (AVException e) {
			e.printStackTrace();
		}
		if(results!=null && results.size() == 1){
			 results.get(0).setLastLoginDate(date.toString());
		}
	}
	
	public void addASeller(Sellers seller) throws AVException{
		seller.save();
	}

}
