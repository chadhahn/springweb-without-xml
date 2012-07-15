package com.codegoop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
	
	final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	public SimpleController() {
		logger.debug("SimpleController init");
	}
	
	@RequestMapping(value = "/greeting") @ResponseBody
	public String greeting() { return "Hello World!"; }
	
	@RequestMapping(value = "/favicon") @ResponseBody
	public String favicon() { return null; }
}