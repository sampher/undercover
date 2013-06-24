package com.familyan.zone.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familyan.zone.core.dao.GameUserDao;
import com.familyan.zone.core.domain.GameUser;
import com.familyan.zone.core.service.GameUserService;

@Service
public class GameUserServiceImpl implements GameUserService {
	
	@Autowired
	private GameUserDao gameUserDao;

	@Override
	public int addGameUser(GameUser gameUser) {
		gameUser.setPassword(encryptPassword(gameUser.getPassword()));
		return gameUserDao.insert(gameUser);
	}

	@Override
	public GameUser getGameUserByUserName(String userName) {
		return gameUserDao.findUserByUserName(userName);
	}

	
	private String encryptPassword(String password) {
		//TODO
		return password;
	}

	@Override
	public boolean login(String userName, String password) {
		GameUser gameUser = gameUserDao.findUserByUserName(userName);
		if(gameUser == null)
			return false;
		
		if(!gameUser.getPassword().equals(encryptPassword(password)))
			return false;
		
		return true;
	}
	
}
