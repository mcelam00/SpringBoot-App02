package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController//Separamos el Rest controller de la aplicacion. 
public class HelloController {

	@RequestMapping("/")//Respondemos a la peticion al directory root
	public String index() { //se llama al método index
		return "Greetings from Spring Boot!";
	}

}
