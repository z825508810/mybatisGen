package cn.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.demo.pojo.User;
import cn.demo.service.UserService;

@RestController
@ResponseBody
public class DemoController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("hello")
	public String sayHello() {
		return "hello word";
	}
	@RequestMapping("showUser")
	public Object showUser(Long id) {
		return userService.showUser(id);
	}
	@RequestMapping("saveUser")
	public int saveUser(User user){
		return userService.saveUser(user);
	}
}
