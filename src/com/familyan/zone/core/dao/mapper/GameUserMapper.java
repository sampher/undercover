package com.familyan.zone.core.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.familyan.zone.core.domain.GameUser;

public class GameUserMapper implements RowMapper<GameUser> {

	@Override
	public GameUser mapRow(ResultSet rs, int num) throws SQLException {
		GameUser gameUser = new GameUser();
		gameUser.setId(rs.getInt("id"));
		return null;
	}

}
