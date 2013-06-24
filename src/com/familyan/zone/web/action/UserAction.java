package com.familyan.zone.web.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.familyan.zone.core.dao.GameUserDao;
import com.familyan.zone.core.domain.GameUser;
import com.familyan.zone.core.service.GameUserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private GameUserService gameUserService;
	
	@RequestMapping("/signon")
	public void signOn(HttpServletRequest request, HttpServletResponse response){
		String userName = request.getParameter("userName");
		String nickName = request.getParameter("nickName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		GameUser gameUser  = new GameUser();
		gameUser.setUserName(userName);
		gameUser.setNickName(nickName);
		gameUser.setPassword(password);
		gameUser.setEmail(email);
		gameUser.setCreateTime(new Date());
		gameUserService.addGameUser(gameUser);
	}
	
	@RequestMapping("/signin")
	public void signIn(String userName, String password,String redirectUrl, HttpServletRequest request, HttpServletResponse response) throws IOException{
		if(gameUserService.login(userName,password)){
			request.getSession().setAttribute("loginUser", "");
		}
		
		response.sendRedirect(redirectUrl);
	}
	
	@RequestMapping("/signout")
	public void signOut(){
		
	}
	
	@RequestMapping("/helloworld")
	public ModelAndView helloWorld(ModelMap model){
		model.put("hello", "world");
		return new ModelAndView("helloworld");
	}
}
