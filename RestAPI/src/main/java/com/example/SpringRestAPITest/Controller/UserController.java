package com.example.SpringRestAPITest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestAPITest.Entity.User;
import com.example.SpringRestAPITest.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/insertUser")
	public User saveuser(@RequestBody User user) {
		return service.saveuser(user);		
	} 
	
	@GetMapping("/fetchAllUser")
	public List<User> getAllUser() {
		return service.getAllUser();				
	}
	
	@GetMapping("/fetchUserByID/{UserId}")
	public User getByUserId(@PathVariable Long UserId) {
		return service.getByUserId(UserId);
	}
	
	@PutMapping("/update/{UserId}")
	public User updateUser(@PathVariable Long UserId, @RequestBody User user) {
		return service.updateUser(UserId,user);		
	}
	
	@DeleteMapping("remove/{UserId}")
	public void deleteUser(@PathVariable Long UserId) {
		 service.deleteUser(UserId);
	}
}
