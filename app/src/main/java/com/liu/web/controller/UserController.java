package com.liu.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.web.model.User;
import com.liu.web.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	/**
	 * 登录  需要
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/login.do")
	public String login(String id,String password,Model model){
		//TODO 应该判断是否为空
		
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		
		User resultUser = this.userService.login(user);
		
		if(resultUser == null){
			return "/login/error";
		}
		
		model.addAttribute("user", resultUser);
		return  "/login/success";
	}
}
