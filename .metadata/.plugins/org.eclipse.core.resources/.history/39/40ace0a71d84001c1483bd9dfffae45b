package com.sunflower.ecommerce.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.ecommerce.model.Categoria;
import com.sunflower.ecommerce.repository.CategoriaRepository;

<<<<<<< HEAD
@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	 public ResponseEntity<List<Categoria>> getAll() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }
}
=======


@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired // Injeção de dependência
	private CategoriaRepository categoriaRepository;

	
	//Busca todas as requisições ao /categoria
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
	}

	// Busca por ID
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable long id) {
		return categoriaRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}

	// Busca por Descrição
	@GetMapping("descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getByDescricao(@PathVariable String descricao_categoria) { // Lista de Descrições
		return ResponseEntity.ok(categoriaRepository.findAllByDescricaoCategoriaContainingIgnoreCase(descricao_categoria));
	}

	// Cria uma nova postagem
	@PostMapping
	public ResponseEntity<Categoria> postCategoria(@Valid @RequestBody Categoria descricao_categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(descricao_categoria));
	}

	// Faz uma atualização em uma postagem existente
	@PutMapping
	public ResponseEntity<Categoria> putCategoria(@Valid @RequestBody Categoria descricao_categoria) {
		return categoriaRepository.findById(descricao_categoria.getId())
				.map(resposta -> ResponseEntity.ok().body(categoriaRepository.save(descricao_categoria)))
				.orElse(ResponseEntity.notFound().build());
	}

	// Deleta algo criado pelo ID
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {

		return categoriaRepository.findById(id).map(resposta -> {
			categoriaRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElse(ResponseEntity.notFound().build());
	}
}
>>>>>>> 1bb3ef7dca99e8b801a7dd938c379c37cefa3343
