package br.org.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	/* SELECT * FROM tb_postagem where titulo like "%titulo%" */
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
}