package com.familyan.zone.core.dao;

import java.util.List;

import com.familyan.zone.core.domain.UserRole;
import com.familyan.zone.core.domain.GameUser;

/**
 * 
 * @author shaowenchao
 * 
 * @since 2013/6/7
 *
 */
public interface GameRoleDao {

	/**
	 * 新增GameRole
	 * 
	 * @param GameRole
	 * 
	 * @return
	 */
	int insert(UserRole GameRole);
	
	/**
	 * 更新GameRole记录
	 * 
	 * @param GameRole
	 * @return
	 */
	int update(UserRole GameRole);
	
	
	/**
	 * 查询所有游戏权限
	 * 
	 * @param 
	 * @return
	 */
	List<UserRole> findGameRoles();
	
	/**
	 * 
	 * @param gameUser
	 * @return
	 */
	List<UserRole> findGameRolesByUser(GameUser gameUser);
	
	/**
	 * 
	 * @param code
	 * @return
	 */
	UserRole findGameRoleByCode(String code);
}
