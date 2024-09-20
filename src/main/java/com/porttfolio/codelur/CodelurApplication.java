package com.porttfolio.codelur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import mongodb.mongoDB;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CodelurApplication {

	public static void main(String[] args) {
		mongoDB mongo =  new mongoDB();
		mongo.connect();
		SpringApplication.run(CodelurApplication.class, args);
		
		
		
	}

}
