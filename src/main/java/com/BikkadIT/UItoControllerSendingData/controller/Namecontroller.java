package com.BikkadIT.UItoControllerSendingData.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Namecontroller {

	@GetMapping("/name")
	public String nameMsg(@RequestParam String name, Model model) {

		String msg = "Hii I am " + name + " From Warora ";
		System.out.println(msg);

		model.addAttribute("MSG", msg);

		return "name";

	}

}
