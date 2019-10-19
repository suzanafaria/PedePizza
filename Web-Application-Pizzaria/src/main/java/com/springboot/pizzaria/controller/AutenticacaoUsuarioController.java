package com.springboot.pizzaria.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.pizzaria.model.Usuario;
import com.springboot.pizzaria.service.UsuarioServiceImplement;

@Controller
public class AutenticacaoUsuarioController {

	private UsuarioServiceImplement usuarioServiceImplement;
	
	
	//método para verificar se login e senha são validos
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String verificarLogin(@RequestParam("login") String login, 
			@RequestParam("senha") String senha,
			HttpSession session, 
			Model model) {
		
		Usuario usuario = usuarioServiceImplement.findByLoginAndSenha(login, senha);
		if(usuario == null) {
			model.addAttribute("loginError", "Usuario não cadastrado. Tente Novamente");
			return "login";
		}
		session.setAttribute("usuarioLogado", usuario);
		return "index";
	}

}
