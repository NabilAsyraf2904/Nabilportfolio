package com.nabil.nabilasyraf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class NabilController {

	
	@RequestMapping("/nabil")
	public ModelAndView myNabil() {
		return new ModelAndView("Nabil");
	}

}