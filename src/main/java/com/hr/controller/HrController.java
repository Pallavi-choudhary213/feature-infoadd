package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HrController {
	
		@GetMapping("/login")
		@ResponseBody
		public String login() {
			return "<h1>Welcome Login page</h1>";
		}

	}


