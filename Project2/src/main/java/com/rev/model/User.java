package com.rev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "userlogin")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "userlogin_user_id_seq", allocationSize = 1)

	@Column(name = "user_id")
	private int userid;
	
	@Column
	private String username;
	@Column
	private String userpassword;
	@Column
	private boolean manager;
	
	public User() {
		super();
	}
	
	public User(String username, String userpassword, boolean manager) {
		super();
		this.username = username;
		this.userpassword = userpassword;
		this.manager = manager;
	}

	public User(int userid, String username, String userpassword, boolean manager) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.manager = manager;
	}
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public boolean isManager() {
		return manager;
	}
	public void setManager(boolean manager) {
		this.manager = manager;
	}

}
