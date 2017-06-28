package com.sg.sample.boot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// inject via application.properties
	

	@RequestMapping("/test")
	public String welcome(Map<String, Object> model) {
	System.out.println("hiiiiii");
		return "Hiiiiiiiiiiiiiiiiiiiiiiiiii welcome";
	}

}