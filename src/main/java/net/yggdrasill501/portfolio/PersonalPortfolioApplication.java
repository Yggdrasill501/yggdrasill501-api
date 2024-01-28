package net.yggdrasill501.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class PersonalPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalPortfolioApplication.class, args);
	}

//	@GetMapping("/")
//	public String hello() {
//		return "Yggdrasill501's Personal Portfolio is being under construction.";
//	}
}