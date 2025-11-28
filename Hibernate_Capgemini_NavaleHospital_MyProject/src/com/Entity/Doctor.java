package com.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private long mob;
	private String specilization;
	private float exp;
	private String qualification;
	private String email;
	private String password;
    private  LocalDateTime dateofCreation;
    private  LocalDateTime dateofModification;
	private String status = "Inactive";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getDateofCreation() {
		return dateofCreation;
	}

	public  void setDateofCreation(LocalDateTime dateofCreation) {
		this.dateofCreation = dateofCreation;
	}

	public LocalDateTime getDateofModification() {
		return dateofModification;
	}

	public  void setDateofModification(LocalDateTime dateofModification) {
		this.dateofModification = dateofModification;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", mob=" + mob + ", specilization=" + specilization + ", exp="
				+ exp + ", qualification=" + qualification + ", email=" + email + ", password=" + password
				+ ", dateofCreation=" + dateofCreation + ", dateofModification=" + dateofModification + ", status="
				+ status + "]";
	}

	
	
}
