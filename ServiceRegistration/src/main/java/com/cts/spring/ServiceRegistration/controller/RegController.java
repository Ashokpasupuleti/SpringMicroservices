package com.cts.spring.ServiceRegistration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Reg/v1/api")
public class RegController {

	@GetMapping("/getdata")

	public String GetData() {
		return "welcome to Spring ";
	}

}
