package com.Safety.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	//@NotNull
	
	private int userId;
	private String userName;
	@OneToMany(targetEntity = Injury.class,cascade=CascadeType.ALL)
	@JoinColumn(name="userId_fk",referencedColumnName="userId")
	private List<Injury> injury;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

} 
