package com.familyan.zone.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.familyan.zone.core.dao.GameUserDao;
import com.familyan.zone.core.dao.mapper.GameUserMapper;
import com.familyan.zone.core.domain.GameUser;
import com.familyan.zone.core.query.GameUserQuery;
import com.familyan.zone.util.Validators;

@Repository
public class GameUserDaoImpl extends BaseDao implements GameUserDao {

	private static final String SQL_INSERT_GAME_USER = "insert into user_account(user_name,nick_name,password,e_mail,create_time,modify_time) "
			 + "values(?,?,?,?,?, ?)";
	private static final String SQL_UPDATE_GAME_USER = "update user_account set nick_name=?,password=?,e_mail=?,modify_time=? where id=?";
	
	private static final String SQL_FIND_GAME_USER = "select * from user_account ";
	
	@Override
	public int insert(GameUser gameUser) {
		return getJdbcTemplate().update(SQL_INSERT_GAME_USER, gameUser.getUserName(),gameUser.getNickName(),
				gameUser.getPassword(),gameUser.getEmail(),gameUser.getCreateTime(),gameUser.getModifyTime());
	}

	@Override
	public int update(GameUser gameUser) {
		return getJdbcTemplate().update(SQL_UPDATE_GAME_USER, gameUser.getNickName(),gameUser.getPassword(),
				gameUser.getEmail(),gameUser.getModifyTime());
	}

	@Override
	public GameUser find(String type, String param) {
		return null;
	}

	@Override
	public List<GameUser> find(GameUserQuery query) {
		return null;
	}

	@Override
	public GameUser findUserById(int id) {
		String sql = SQL_FIND_GAME_USER + " where id=?";
		List<GameUser> gameUsers = getJdbcTemplate().query(sql,new Object[]{id}, new GameUserMapper());
		if(Validators.isEmpty(gameUsers)) {
			return null;
		}
		
		return gameUsers.get(0);
	}

	@Override
	public GameUser findUserByUserName(String userName) {
		String sql = SQL_FIND_GAME_USER + " where user_name=?";
		List<GameUser> gameUsers = getJdbcTemplate().query(sql,new Object[]{userName}, new GameUserMapper());
		if(Validators.isEmpty(gameUsers)) {
			return null;
		}
		
		return gameUsers.get(0);
	}

}
