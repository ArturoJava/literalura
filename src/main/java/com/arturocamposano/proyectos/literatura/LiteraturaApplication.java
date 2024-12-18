
package com.arturocamposano.proyectos.literatura;

import com.arturocamposano.proyectos.literatura.principal.Principal;
import com.arturocamposano.proyectos.literatura.repository.AutorRepository;
import com.arturocamposano.proyectos.literatura.repository.LibroRepository;
import com.arturocamposano.proyectos.literatura.service.AutorService;
import com.arturocamposano.proyectos.literatura.service.LibroService;
import com.arturocamposano.proyectos.literatura.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Autowired
	private LibroService libroService;
	@Autowired
	private AutorService autorService;
	private MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroService,autorService);
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}
}