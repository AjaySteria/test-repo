package com.steria.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerRestApiApplication {
	
	@GetMapping("/info")
	public String getMsg() {
		return "HI YOUR APPLICATION IS RUNNING NOW...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerRestApiApplication.class, args);
	}

}
