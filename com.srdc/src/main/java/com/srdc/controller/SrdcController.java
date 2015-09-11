package com.srdc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping(value="/test")
public class SrdcController {

	@RequestMapping(method=RequestMethod.GET)
	public String getTest(){
		return "welcome";
	}
}
