package com.gd.science.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
		
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("redirect:/admin/index");
		
	}
	@RequestMapping("/admin/index")
	public ModelAndView indexPage() {
		return new ModelAndView("admin/index");
		
	}
}
