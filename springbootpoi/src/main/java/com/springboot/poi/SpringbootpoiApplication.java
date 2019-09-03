package com.springboot.poi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootpoiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpoiApplication.class, args);
	}

	public  void demo1(){
		System.out.println("测试方法");
	}
}
