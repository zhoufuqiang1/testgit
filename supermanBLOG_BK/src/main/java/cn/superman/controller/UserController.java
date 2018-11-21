package cn.superman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.superman.model.User;
import cn.superman.service.user.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/list")
	public List<User> exexute() {
		return userService.getUserList();
	}
	@RequestMapping("/search")
	public boolean exexute(String userName,String passWord) {
		return userService.searchUser(userName, passWord);
	}
}
