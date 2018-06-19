package com.ahrisy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/my")
public class MyController {

	@RequestMapping("/vvv")
	public String vvv(Model model) {
		model.addAttribute("big", "aaa.JpG");
		model.addAttribute("small", "bbb.jpG");
		model.addAttribute("other", "dasdasddas");
		return "vvv";
	}
}
