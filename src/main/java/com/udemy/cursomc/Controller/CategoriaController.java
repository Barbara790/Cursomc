package com.udemy.cursomc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.cursomc.model.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria>listar() {
		
		Categoria c1 = new Categoria(1,"Informártica");
		Categoria c2 = new Categoria(2,"Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		
		return lista;
	}
}
