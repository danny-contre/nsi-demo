package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Logger logger = Logger.getLogger(DemoApplication.class.getName());

		List<String> texts = new ArrayList<>();
        texts.add("Hello World :)!");
		logger.log(Level.INFO, () -> String.valueOf(texts));
		System.out.println("Hello NSI");
	}
}
