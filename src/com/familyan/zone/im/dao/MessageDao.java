package com.familyan.zone.im.dao;

import java.util.List;

import com.familyan.zone.im.domain.Message;

public interface MessageDao {

	int insert(Message message);
	
	List<Message> findUnreadMessagesByReceiver(String receiver);
}
