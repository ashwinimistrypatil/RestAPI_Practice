package com.example.SpringRestAPITest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestAPITest.Entity.User;
import com.example.SpringRestAPITest.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;
	
	
	@Override
	public User saveuser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}

	@Override
	public User getByUserId(Long UserId) {
		return repository.findById(UserId).orElse(null);
	}

	@Override
	public User updateUser(Long UserId, User user) {
		User checkUser = repository.findById(UserId).orElse(null);
		if(checkUser!=null) {
			checkUser.setName(user.getName());
			checkUser.setEmaiId(user.getEmaiId());
			repository.save(checkUser);
		}
		return null;
	}

	@Override
	public void deleteUser(Long UserId) {
		 repository.deleteById(UserId);
	}

}
