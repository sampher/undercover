package com.familyan.zone.im.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.familyan.zone.core.dao.impl.BaseDao;
import com.familyan.zone.im.dao.MessageDao;
import com.familyan.zone.im.dao.mapper.MessageRowMapper;
import com.familyan.zone.im.domain.Message;

@Repository
public class MessageDaoImpl extends BaseDao implements MessageDao {

	private static final String SQL_INSERT_MESSAGE = "insert into message(code,value,sender,receiver,send_time, read_flag,create_time,modify_time) values(?,?,?,?,?, ?,?,?)";
	private static final String SQL_FIND_MESSAGES_BY_RECEIVER = "select * from message where receiver=:receiver and read_flag=1";
	
	@Override
	public int insert(Message message) {
		return getJdbcTemplate().update(SQL_INSERT_MESSAGE, message.getCode(),
				message.getValue(),message.getSender(),message.getReceiver(),
				message.getSendTime(),message.getReadFlag(),message.getCreateTime(),message.getModifyTime());
	}

	@Override
	public List<Message> findUnreadMessagesByReceiver(String receiver) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("receiver", receiver);
		return getNamedJdbcTemplate().query(SQL_FIND_MESSAGES_BY_RECEIVER, parameters, new MessageRowMapper());
	}

}
