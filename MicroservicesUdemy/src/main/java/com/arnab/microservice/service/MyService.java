package com.arnab.microservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Value("${com.arnab.myconstant}")
	private String constantValue;
	
	public String getConstantValue() {
		return this.constantValue;
	}
	
}
