package com.BikkadIT.UItoControllerSendingData.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping("/welcomeUI")
	public String welcomeMsg(@RequestParam String name, Model model) {

		String msg = "Hii " + name + " Welcome to Nagpur";
		System.out.println(msg);
		
		model.addAttribute("LESS", msg);

		return "welcome";

	}

}
