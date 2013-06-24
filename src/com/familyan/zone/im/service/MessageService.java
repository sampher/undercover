package com.familyan.zone.im.service;

import java.util.List;

import com.familyan.zone.im.domain.Message;

public interface MessageService {

	int addMessage(Message message);
	
	List<Message> getMessages(String receiver);
}
