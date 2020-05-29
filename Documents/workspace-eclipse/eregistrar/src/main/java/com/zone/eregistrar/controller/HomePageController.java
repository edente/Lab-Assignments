package com.zone.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping(value= {"/","/home"})
	public String myPage() {
		return "index";
	}
	
	

}
