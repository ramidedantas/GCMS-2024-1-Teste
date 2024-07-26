package com.example.WebApp20241Teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!";
	}
	
	@RequestMapping("/fulano")
	public @ResponseBody String greetingFulano() {
		return "Hello, Fulano!";
	}
	
	@RequestMapping("/main")
	public @ResponseBody String greetingMain() {
		return "Hello, Main!";
	}

		@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Hello, Hotfix!";
	}
}
