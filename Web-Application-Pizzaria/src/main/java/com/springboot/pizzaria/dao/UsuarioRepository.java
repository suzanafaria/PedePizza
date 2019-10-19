package com.springboot.pizzaria.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.pizzaria.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
//	public String findByEmail(String login);
//	public String findBySenha(String senha);

}
