package com.Controller;

import com.Service.AdminService;

public class AdminController {

	public void approveDoctor(int id) {
	    AdminService service = new AdminService();
	    String msg = service.approveDoctor(id);
	    System.out.println(msg);
	}


}
