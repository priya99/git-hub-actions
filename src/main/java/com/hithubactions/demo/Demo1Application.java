package com.hithubactions.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Demo1Application {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}
	
	
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/priya99/git-hub-actions.git
//	git push -u origin main
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
