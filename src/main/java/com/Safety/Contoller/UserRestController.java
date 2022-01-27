package com.Safety.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Safety.Model.User;
import com.Safety.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	
	@Autowired
	UserService service;
	
	
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@Validated @RequestBody User user){
		User e=service.addUser(user);
		System.out.println(e);
		//return ResponseEntity.ok().body("new employee added successfully");
		return  new ResponseEntity<User>(e,HttpStatus.OK);
	}
	
	}

//}
    