package com.liu.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.liu.web.dao.UserMapper;
import com.liu.web.model.User;
import com.liu.web.model.UserExample;
import com.liu.web.service.UserService;



/**
 * 用户相关业务
 * @author liutianbo
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	/**
	 * 用户登录 
	 * 需要传入 用户id 和密码 
	 * 如果查询有此人 则返回用户信息
	 * 如果查询没有此人 返回空
	 * @param user
	 * @return
	 */
	public User login(User user){
		if(user == null){
			System.out.println("用户信息为空-----登陆");
			return null;
		}
		if(StringUtils.isEmpty(user.getId())){
			System.out.println("用户id为空-----登陆");
			return null;
		}
		if(StringUtils.isEmpty(user.getPassword())){
			System.out.println("用户密码为空-----登陆");
			return null;
		}
		
		
		UserExample ue = new UserExample();
		ue.createCriteria().andIdEqualTo(user.getId()).andPasswordEqualTo(user.getPassword());
		
		List<User> resultUserList = this.userMapper.selectByExample(ue);
		
		// TODO 如果查出多条记录 应该报错
		if(resultUserList == null || resultUserList.size()==0){
			return null;
		}
		
		return resultUserList.get(0);
	}
}
