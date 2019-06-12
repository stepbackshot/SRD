package cn.com.rmiserver.entity;

import java.io.Serializable;

public class User implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1370200741323315736L;
	
	private String userId;
	private String userName;
	private int age;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", age=" + age + "]";
	}
	
	

}
