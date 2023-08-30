package com.example.demo.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;
@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	public Iterable<User> list(){
		return userRepository.findAll();
	}
	
	public User save(User user)
	{
		return userRepository.save(user);
	}
	public Iterable<User> save(List<User> users){
		return userRepository.saveAll(users);
	}

	

}
