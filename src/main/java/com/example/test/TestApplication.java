package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/")
	public static String Hello(){
		return "Hello world!";
	}

	@GetMapping("/mathTest")
	public static int mathTest(){
		int a = 5;
		int b = 6;
		return a - b;
	}
}