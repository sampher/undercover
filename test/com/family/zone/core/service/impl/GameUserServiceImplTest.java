package com.family.zone.core.service.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.family.zone.core.SpringTestBase;
import com.familyan.zone.core.domain.GameUser;
import com.familyan.zone.core.service.GameUserService;

public class GameUserServiceImplTest extends SpringTestBase {

	@Autowired
	private GameUserService gameUserService;
	
	@Test
	public void testAddGameUser() {
		GameUser gameUser = new GameUser();
		gameUser.setUserName("admin");
		gameUser.setNickName("admin");
		gameUser.setPassword("admin");
		gameUser.setCreateTime(new Date());
		gameUser.setEmail("356254600@qq.com");
		gameUserService.addGameUser(gameUser);
		
		GameUser user = gameUserService.getGameUserByUserName("admin");
		
		if(user!=null){
			Assert.assertEquals(gameUser.getUserName(), user.getUserName());
			Assert.assertEquals(gameUser.getNickName(), user.getNickName());
		}
	}

	@Test
	public void testGetGameUserByUserName() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
