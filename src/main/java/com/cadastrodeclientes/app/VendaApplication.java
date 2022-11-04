package com.cadastrodeclientes.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendaApplication {

	@GetMapping("/home")
	public String homeMap(){
		return "Deu certo";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendaApplication.class, args);
	}
}
