package com.example.SpringRestAPITest.Service;

import java.util.List;

import com.example.SpringRestAPITest.Entity.User;

public interface UserService {
	
	User saveuser(User user);
	List<User> getAllUser();
	User getByUserId(Long UserId);
	User updateUser(Long id, User user);
    void deleteUser(Long id);
}
