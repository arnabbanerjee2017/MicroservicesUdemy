package com.arnab.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.microservice.service.MyService;

@RestController
@RequestMapping(value = "/temp")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping(value = "/value")
	public String getService() {
		return service.getConstantValue();
	}
	
}
