package com.infygouser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infygouser.dto.UserDTO;

@Entity
@Table(name="user_details")
public class User {
	@Id
	@Column(name = "userid")
	private String id;
	
	private String password;
	private String name;
	private String city;
	private String email;
	private String phone;
	
	public User() {
		
	}
	
	public User(String id, String password, String name, String city, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	@Override
	public String toString() {
		return "User [ id "+ this.id +" password " + this.password +  " name " + this.name + " city " + this.city + " email " + this.email + " phone "+ this.phone + "  ]";
	}
	
	public static UserDTO perpareUserDTO (User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setCity(user.getCity());
		userDTO.setEmail(user.getEmail());
		userDTO.setName(user.getName());
		userDTO.setPassword(user.getPassword());
		userDTO.setPhone(user.getPhone());
		userDTO.setId(user.getId());
		
		return userDTO;
	}
	
}
