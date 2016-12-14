package cn.itcast.ssm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUserById(Integer id) throws Exception {
		User user = userMapper.findUserById(id);
		return user;
	}

}
