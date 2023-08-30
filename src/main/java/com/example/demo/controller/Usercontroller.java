package com.example.demo.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;



@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	private UserService userService;
	
	public Usercontroller(UserService userService) {
	
		this.userService = userService;
	}
	
  @GetMapping("/list")
  public Iterable<User> list(){
	return userService.list();
	 
	
  }
}
