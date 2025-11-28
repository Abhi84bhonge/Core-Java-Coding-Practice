package com.Controller;

import com.Entity.Doctor;

import com.Service.DoctorService;

public class DoctorController {

	public String registerDoctor(Doctor docter) {
		DoctorService ds=new DoctorService();
		return ds.registerDoctor(docter);
	}
  
	
	public String doctorLogin(String email,String password) {
		DoctorService dsc=new DoctorService();
		return dsc.doctorLogin(email, password);
		
		
	}
}
