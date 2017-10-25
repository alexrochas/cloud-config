package com.alex.cloudconfig

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CloudConfigApplication {

	static void main(String[] args) {
		SpringApplication.run CloudConfigApplication, args
	}
}
