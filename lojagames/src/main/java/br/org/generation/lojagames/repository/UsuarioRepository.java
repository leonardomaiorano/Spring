package br.org.generation.lojagames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojagames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	//select * from tb_usuarios where usuario = "usuario"
	public Optional<Usuario> findByUsuario(String usuario);

}