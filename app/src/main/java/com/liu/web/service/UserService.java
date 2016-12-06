package com.liu.web.service;

import com.liu.web.model.User;

/**
 * 用户相关业务
 * @author liutianbo
 *
 */
public interface UserService {
	/**
	 * 用户登录 
	 * 需要传入 用户id 和密码 
	 * 如果查询有此人 则返回用户信息
	 * 如果查询没有此人 返回空
	 * @param user
	 * @return
	 */
	public User login(User user);
}
