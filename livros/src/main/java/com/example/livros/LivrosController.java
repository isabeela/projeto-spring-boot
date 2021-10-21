package com.example.livros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivrosController {
	
	@GetMapping("/")
	public String principal () {
		return "index";
	}

}
