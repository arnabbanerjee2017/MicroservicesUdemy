package com.arnab.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicesUdemyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUdemyConfigServerApplication.class, args);
	}

}
