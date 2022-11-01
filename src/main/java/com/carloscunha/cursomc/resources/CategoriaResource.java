package com.carloscunha.cursomc.resources;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carloscunha.cursomc.domain.Categoria;
import com.carloscunha.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
//  @RequestMapping(method = RequestMethod.GET)
//	public String listar() {
//		return "REST está funcionando!";
//	}

//	@RequestMapping(method = RequestMethod.GET)
//	public List<Categoria> listar() {
//		
//		Categoria cat1 = new Categoria();
//		
//		cat1.setId(1);
//		cat1.setNome("Informática");
//
//		Categoria cat2 = new Categoria();
//
//		cat2.setId(2);
//		cat2.setNome("Escritório");
//
//		List<Categoria> lista = new ArrayList<>(); 
//		
//		lista.add(cat1);
//		lista.add(cat2);
//	
//		return lista;
//		
//	}
	
}
