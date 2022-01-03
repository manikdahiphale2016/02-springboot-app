package com.manikit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCdontroller {
	
	@GetMapping
	public String getUser() {
		return "";
	}

	@DeleteMapping("/delete")
	public void deleteUser(){
		//code here
	}

}
