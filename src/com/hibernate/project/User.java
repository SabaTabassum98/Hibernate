package com.hibernate.project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User{
	

	public User(int user_id, String user_Fname, String user_Lname, String user_email) {
		this.user_id = user_id;
		this.user_Fname = user_Fname;
		this.user_Lname = user_Lname;
		this.user_email = user_email;
	}

	@Id 
	@Column(name="user_id")
	int user_id;
	
	@Column(name="user_Fname")
	String user_Fname;
	
	@Column(name="user_Lname")
	String user_Lname;
	
	@Column(name="user_email")
	String user_email;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_Fname() {
		return user_Fname;
	}

	public void setUser_Fname(String user_Fname) {
		this.user_Fname = user_Fname;
	}

	public String getUser_Lname() {
		return user_Lname;
	}

	public void setUser_Lname(String user_Lname) {
		this.user_Lname = user_Lname;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUsers_email(String user_email) {
		this.user_email = user_email;
	}
	

}



