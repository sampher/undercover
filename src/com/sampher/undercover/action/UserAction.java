package com.sampher.undercover.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@RequestMapping("/signon")
	public void signOn(){
		
	}
	
	@RequestMapping("/signin")
	public void signIn(){
		
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
