package com.springboot.pizzaria.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.pizzaria.dao.UsuarioRepository;
import com.springboot.pizzaria.model.Usuario;


@Service("usuarioService")
@Transactional
public class UsuarioServiceImplement implements UsuarioService{


	private UsuarioRepository repository;
		
	
	@Override
	public Usuario findByLoginAndSenha(String login, String senha) {
		Usuario usuario = repository.findByLoginAndSenha(login, senha);
		
		if((usuario.getLogin().equalsIgnoreCase(login)) && (usuario.getSenha().equalsIgnoreCase(senha))) {
			return usuario;
		}
		return null;
		
	}

}
