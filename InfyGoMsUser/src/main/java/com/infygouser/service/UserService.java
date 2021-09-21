package com.infygouser.service;

//import java.util.ArrayList;
import java.util.List;

import com.infygouser.dto.UserDTO;
import com.infygouser.model.User;
import com.infygouser.rest.objs.LoginForm;

public interface UserService {
	public String addUser(UserDTO user);
	public UserDTO getUser(String id);
	public List<User> getAllUsers();
	public void removeUser(String id);
	public UserDTO updateUser(String id, User newUser);
	public String userLogin(LoginForm login);
}
