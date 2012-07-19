package com.codegoop.controller;

import com.codegoop.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
public class SimpleController {
	
	final Logger logger = LoggerFactory.getLogger(SimpleController.class);
	
	public SimpleController() {
		logger.debug("SimpleController init");
	}
	
	@RequestMapping(value = "/greeting") @ResponseBody
	public String greeting() { return "Hello World!"; }
  
  @RequestMapping(value = "/person", method = RequestMethod.POST) @ResponseBody
  public String addPerson(@Valid  @RequestBody final Person person) { return "Person added: " + person; }

  @ExceptionHandler(MethodArgumentNotValidException.class) @ResponseBody @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public String handleValidationError(final MethodArgumentNotValidException error) {
    return error.getBindingResult().getAllErrors().toString();
  }
}