package com.example.Bookfineder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.Bookfineder")
public class BookfinederApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookfinederApplication.class, args);
	}

}
