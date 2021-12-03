package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping
	public String getMapping() {
		System.out.println("Get Mapping Executed");
		return "String";
	}
}
