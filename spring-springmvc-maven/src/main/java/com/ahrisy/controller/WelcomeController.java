package com.ahrisy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahrisy.service.MyService;

@Controller
@RequestMapping("/")
public class WelcomeController {
	@Autowired MyService myService;
	@RequestMapping("/")
	public String main() {
		myService.aa();
		return "aaa";
	}
}
