package com.alex.cloudclient

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class CloudClientApplication {

    @Value('${message}')
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

	static void main(String[] args) {
		SpringApplication.run CloudClientApplication, args
	}
}
