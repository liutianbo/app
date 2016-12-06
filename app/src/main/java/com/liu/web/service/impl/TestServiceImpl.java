package com.liu.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.web.dao.TestUserMapper;
import com.liu.web.model.TestUser;
import com.liu.web.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Resource
	private TestUserMapper testUserMapper;

	@Override
	public List<TestUser> listuser() {
//		return this.testUserMapper.selectByCondition(new TestUser());
		return null;
	}

	
	
	
}
