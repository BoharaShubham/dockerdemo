package net.javaguides.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot1Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "Springboot 1";
	}
	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}

}
