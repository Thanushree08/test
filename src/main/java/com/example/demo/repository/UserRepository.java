package com.example.demo.repository;


import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	

}
