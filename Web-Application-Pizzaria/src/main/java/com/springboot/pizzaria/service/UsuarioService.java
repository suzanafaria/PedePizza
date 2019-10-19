package com.springboot.pizzaria.service;

import com.springboot.pizzaria.model.Usuario;

public interface UsuarioService {

	public Usuario findByLoginAndSenha(String login, String senha);
	
}
