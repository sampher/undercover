package com.familyan.zone.im.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.familyan.zone.im.domain.Message;
import com.familyan.zone.im.service.MessageService;
import com.familyan.zone.util.UUIDUtils;

@Controller
@RequestMapping("/message")
public class MessageAction {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/sendMessage")
	public void sendMessage(HttpServletRequest request ){
		Message message = new Message();
		message.setValue(request.getParameter("value"));
		message.setCode(UUIDUtils.newUUID());
		//message.setCreateTime(new Date());
		message.setSendTime(new Date());
		message.setSender(request.getParameter("sender"));
		message.setReceiver(request.getParameter("receiver"));
		//validate 
		//TODO
		
		messageService.addMessage(message);
	}
	
	@RequestMapping("/getMessages")
	@ResponseBody
	public Map<String, List<Message>> getMessages(HttpServletRequest request, HttpServletResponse response) {
		Map<String, List<Message>> json = new HashMap<String, List<Message>>();
		List<Message> messages = messageService.getMessages(request.getParameter("receiver"));
		json.put("messages", messages);
		return json;
	}
}
