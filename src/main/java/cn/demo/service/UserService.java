package cn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.demo.dao.UserMapper;
import cn.demo.pojo.User;

@Service
public class UserService {
    
	@Autowired
	private UserMapper userMapper;
	
	public User showUser(Long id){
		return userMapper.selectByPrimaryKey(id);
	}
	public int saveUser(User user){
		return userMapper.insert(user);
	}
}
