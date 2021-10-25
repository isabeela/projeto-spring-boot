package com.example.livros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivrosController {
	
	@GetMapping("/")
	public String principal () {
		return "index";
	}
	
	@GetMapping("/lidos")
	public String lidos () {
		return "lidos";
	}
	
	@GetMapping("/proximas")
	public String proximas () {
		return "proximas";
	}
	
	@GetMapping("/lista-desejos")
	public String listadeDesejos () {
		return "lista-desejos";
	}
		
	@GetMapping("/emprestados")
	public String emprestados () {
		return "emprestados";
	}

}
