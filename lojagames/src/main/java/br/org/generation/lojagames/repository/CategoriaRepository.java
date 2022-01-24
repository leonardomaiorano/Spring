package br.org.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojagames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	/* SELECT * FROM tb_postagem where titulo like "%titulo%" */
	public List <Categoria> findAllByTituloContainingIgnoreCase(String titulo);
	
}
