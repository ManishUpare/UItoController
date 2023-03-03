package com.BikkadIT.UItoControllerSendingData.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {

	@GetMapping("/printValue/{a}")
	public String printValue(@PathVariable int a, Model model) {

		String msg = "The value of a is " + a;

		model.addAttribute("ADDITION", msg);

		return "print";

	}

	@GetMapping("/addition/{a}/{b}")
	public String additionOfNo(@PathVariable int a, @PathVariable int b, Model model) {

		int c = a + b;

		String msg = "Addition of a and b is " + c;
		model.addAttribute("ADD", msg);

		return "add";

	}

}
