package com.UserLoginJDBC;

import java.sql.Timestamp;

public class User {

private int id;
private String fullName;
private String username;
private String password;
private String aadharFilePath;
private Timestamp createdAt;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAadharFilePath() {
	return aadharFilePath;
}
public void setAadharFilePath(String aadharFilePath) {
	this.aadharFilePath = aadharFilePath;
}
public Timestamp getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Timestamp createdAt) {
	this.createdAt = createdAt;
}

public User() {}

public User(String fullName, String username, String password, String aadharFilePath) {
    this.fullName = fullName;
    this.username = username;
    this.password = password;
    this.aadharFilePath = aadharFilePath;
}




}
