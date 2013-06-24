package com.familyan.zone.im.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.familyan.zone.im.domain.Message;

public class MessageRowMapper implements RowMapper<Message> {

	@Override
	public Message mapRow(ResultSet rs, int rowNum) throws SQLException {
		Message message = new Message();
		message.setCode(rs.getString("code"));
		message.setValue(rs.getString("value"));
		message.setSender(rs.getString("sender"));
		message.setReceiver(rs.getString("receiver"));
		message.setSendTime(rs.getTimestamp("send_time"));
		message.setCreateTime(rs.getTimestamp("create_time"));
		message.setModifyTime(rs.getTimestamp("modify_time"));
		return message;
	}

}
