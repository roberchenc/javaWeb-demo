package com.ccl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/*
 * 主控类，该类中信息管理员可见，部分信息都可见
 * 
 */
@Entity
@Table(name = "users_tb")
public class Users {

	@Id
	@GeneratedValue(generator = "userNumber")
	@GenericGenerator(name = "userNumber", strategy = "assigned")
	@Column(length = 10, name = "number_user")
	private String userNumber;     //默认为学号，其他为工号，可为无号人员分配编号，仅供该系统使用

	@Column(name = "name_user")
	private String userName;

	@Column(name = "password_user")
	private String passWord;
	
	@Column(name = "birthDate_user")
	private String birthDate;
	
	@Column(name = "sex_user")
	private String sex = "male";
	
	@Column(name = "level_user")
	private Integer level;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Users(String userNumber, String userName, String passWord, String birthDate, String sex,
			Integer level) {
		super();
		this.userNumber = userNumber;
		this.userName = userName;
		this.passWord = passWord;	
		this.birthDate = birthDate;
		this.sex = sex;
		this.level = level;
	}
	

	public Users(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Users [userNumber=" + userNumber + ", userName=" + userName + ", passWord=" + passWord + ", birthDate="
				+ birthDate + ", sex=" + sex + ", level=" + level + "]";
	}

	
	
	

	
}
