package com.springboot.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String login(Model model) {
		model.addAttribute("attribute", "value");
		return "loginForm";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("attribute", "value");
		return "index";
	
	}

}
