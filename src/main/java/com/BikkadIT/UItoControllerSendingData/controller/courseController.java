package com.BikkadIT.UItoControllerSendingData.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class courseController {

	@GetMapping("/course")
	public ModelAndView getcoursedetails(@RequestParam String cname, @RequestParam String tname) {

		String msg = cname + " is starting from 1 feb by " + tname;

		ModelAndView mav = new ModelAndView();

		mav.addObject("COURSE", msg);
		mav.setViewName("course");

		return mav;

	}

}
