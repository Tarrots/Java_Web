package com.laptrinhjavaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/trangchu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
}
