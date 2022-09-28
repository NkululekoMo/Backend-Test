package net.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bean.User;
import net.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	public List<User> findAllUsers() {
		return userRepo.findAll();		// findAll return list of entities 
	}
	
	public String storeUser(User user) {
		Optional<User> result	= userRepo.findById(user.getId());
		if(result.isPresent()) {
			return "Product id must be unique";
		}else {
			userRepo.save(user);
			return "User record stored successfully";
		}
	}
	
	public String updateUser(User user) {
		Optional<User> result	= userRepo.findById(user.getId());
		if(result.isPresent()) {
			User u = result.get();
			u.setContactNumber(user.getContactNumber());
			userRepo.saveAndFlush(u);
			return "User Details updated successfully";
		}else {
			return "User not present";
		}
	}
	public String deleteUser(int id) {
		Optional<User> result	= userRepo.findById(id);
		if(result.isPresent()) {
			User u = result.get();
			userRepo.delete(u);
			return "User Details deleted successfully";
		}else {
			return "User not present";
		}
	}
}
