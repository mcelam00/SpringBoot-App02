package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //Aplicación springboot
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//Creamos una componente. BEAN es una componente que se apoya en el contenedor que se instala en el apache tomcat

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) { //método que se convierte en un bean
		return args -> { //una funcion lamda

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames(); //Tiene las definiciones de los beans definidos en el contexto
			Arrays.sort(beanNames); //se ordena el array
			for (String beanName : beanNames) {
				System.out.println(beanName); //se visualiza
			}

		};
	}

}
