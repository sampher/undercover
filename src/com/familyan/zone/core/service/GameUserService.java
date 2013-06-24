package com.familyan.zone.core.service;

import com.familyan.zone.core.domain.GameUser;

public interface GameUserService {

	int addGameUser(GameUser gameUser);
	
	GameUser getGameUserByUserName(String userName);

	boolean login(String userName, String password);
}
