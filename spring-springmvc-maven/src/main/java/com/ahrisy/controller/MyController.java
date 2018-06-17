package com.ahrisy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/my")
public class MyController {

	@RequestMapping("/aaa")
	public String myC() {
		return "aaa";
	}
}
