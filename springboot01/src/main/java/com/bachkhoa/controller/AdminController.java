package com.bachkhoa.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/admin/home")
	public String goToAdmin() {
		return "admin";
	}
}
