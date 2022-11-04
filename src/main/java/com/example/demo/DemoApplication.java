package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.DisplayName;
import org.springframework.data.relational.*;

@SpringBootApplication
public class DemoApplication extends BaseTest{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private BookTestRepo bookRepo;

	@Autowired
	private AuthorTestRepo authorRepo;

	@Test
	@DisplayName("many-to-many-mapping-test")
	//@Sql(scripts="/many-to-many-mapping.sql")
	void embeddedMappingTest()
	{
		Book b1= bookRepo.save(getBook1());

	}



}
