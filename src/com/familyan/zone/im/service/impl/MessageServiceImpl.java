package com.familyan.zone.im.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familyan.zone.im.dao.MessageDao;
import com.familyan.zone.im.domain.Message;
import com.familyan.zone.im.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	
	@Override
	public int addMessage(Message message) {
		return messageDao.insert(message);
	}

	@Override
	public List<Message> getMessages(String receiver) {
		return messageDao.findUnreadMessagesByReceiver(receiver);
	}

}
