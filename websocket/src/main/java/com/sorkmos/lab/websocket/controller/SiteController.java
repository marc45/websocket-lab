package com.sorkmos.lab.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@RequestMapping("/")
	public String main() {
		return "main";
	}
}
