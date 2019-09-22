package com.cts.spring.ServiceRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.spring.ServiceRegistration.service.RegServiceHelper;

@RestController
@RequestMapping("/Reg/v1/api")
public class RegController {

	@Autowired
	RegServiceHelper regServiceHelper;

	@GetMapping("/getdata")
	public String GetData() {
		return regServiceHelper.getData();
	}

}
