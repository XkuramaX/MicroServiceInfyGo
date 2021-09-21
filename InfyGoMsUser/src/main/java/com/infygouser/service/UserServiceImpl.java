package com.infygouser.service;
import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.infygouser.dto.UserDTO;
import com.infygouser.model.User;
import com.infygouser.repository.UserRepository;
import com.infygouser.rest.objs.LoginForm;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	@Override
	public String addUser(UserDTO user) {
		// TODO Auto-generated method stub
		User userEntity = UserDTO.perpareUser(user);
		if (repo.findById(user.getId()).isPresent()) {
			return "User with that id already exists";
		}
		repo.saveAndFlush(userEntity);
		return "User is successfully added";
		
	}

	@Override
	public UserDTO getUser(String id) {
		// TODO Auto-generated method stub
		Optional<User> user =  repo.findById(id);
		User userEntity = user.get();
		UserDTO userDTO = User.perpareUserDTO(userEntity);
		return userDTO;
	}

	@Override
	public void removeUser(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public UserDTO updateUser(String id, User newUser) {
		// TODO Auto-generated method stub
		Optional<User> requiredUser = repo.findById(id);
		User user = requiredUser.get();
		user.setCity(newUser.getCity());
		user.setEmail(newUser.getEmail());
		user.setName(newUser.getEmail());
		user.setPhone(newUser.getPhone());
		repo.saveAndFlush(user);
		Optional<User> updated = repo.findById(id);
		User updatedUser = updated.get();
		UserDTO updateResponse = User.perpareUserDTO(updatedUser);
		return updateResponse;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> allUsers = repo.findAll(); 
		return allUsers;
	}

	@Override
	public String userLogin(LoginForm login) {
		// TODO Auto-generated method stub
		Optional<User> requiredUser = repo.findById(login.getId());
		if (requiredUser.isPresent()) {
			User user = requiredUser.get();
			if (user.getPassword().equals(login.getPassword())) {
				return "Login is successful. Token is " + user.getId() + "-" + LocalDate.now();
				
			}
			
			return "Wrong Password!";
		}
		return "Wrong username";
		
	}

}
