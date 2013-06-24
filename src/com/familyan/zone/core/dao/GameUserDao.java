package com.familyan.zone.core.dao;

import java.util.List;

import org.apache.catalina.User;

import com.familyan.zone.core.domain.GameUser;
import com.familyan.zone.core.query.GameUserQuery;

public interface GameUserDao {

	/**
	 * 新增GameUser
	 * 
	 * @param gameUser
	 * 
	 * @return
	 */
	int insert(GameUser gameUser);
	
	/**
	 * 更新GameUser记录
	 * 
	 * @param gameUser
	 * @return
	 */
	int update(GameUser gameUser);
	
	/**
	 * 根据GameUser的某一属性查找
	 * 
	 * @param type-属性 
	 * @param param-值
	 * 
	 * @return GameUser ,如果不存在  返回null
	 */
	GameUser find(String type, String param);
	
	/**
	 * 按条件查询用户 
	 * @param query
	 * @return
	 */
	List<GameUser> find(GameUserQuery query);
	
	
	GameUser findUserById(int id);
	
	GameUser findUserByUserName(String userName);
	
}
