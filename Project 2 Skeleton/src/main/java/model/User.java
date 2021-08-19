package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "employee_id_seq", allocationSize = 1)
	private int id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private boolean manager;

	public User() {
		super();
	}

	public User(String uname, String pwd, boolean mgr) {
		super();
		this.username = uname;
		this.password = pwd;
		this.manager = mgr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String uname) {
		this.username = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pwd) {
		this.password = pwd;
	}

	public boolean getManager() {
		return false;
	}

	public void setManager(boolean mgr) {
		this.manager = mgr;
	}


}
