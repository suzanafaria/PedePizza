package com.springboot.pizzaria.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.pizzaria.dao.UsuarioRepository;
import com.springboot.pizzaria.model.Usuario;


@Controller
public class AutenticacaoUsuarioController {

	private UsuarioRepository repository;
	
	public AutenticacaoUsuarioController(UsuarioRepository repository) {
		this.repository = repository;
	}

	@RequestMapping("/login")
    public String index(Model model) {
		List<Usuario> usuarios = this.repository.findAll();
		model.addAttribute("attribute", "value");
		return "loginForm";
    }
	
	
	@RequestMapping(value = "/logar", method = RequestMethod.POST)
	public String verificarLogin(@ModelAttribute("usuario") Usuario usuario,
			@RequestParam("login") String login, 
			@RequestParam("senha") String senha,
			HttpSession session, 
			ModelMap modelMap) {
		
		if(("suzana@gmail.com").equalsIgnoreCase(login) && (("123").equalsIgnoreCase(senha))) {
			session.setAttribute("login", login);
			return "index";
		} else {
			return "login/?mensagem" + "Login invalido";

		}

	}
}


//@RequestMapping("/logar")
//public String loginUser(@ModelAttribute("usuario") Usuario usuario, 
//		@RequestParam("login") String login, 
//		@RequestParam("senha") String senha,
//		HttpSession session, 
//		ModelMap modelMap) {
//	
//	if((login).equalsIgnoreCase(this.repository.findByEmail(login)) && (senha).equalsIgnoreCase(this.repository.findBySenha(senha))) {
//		session.setAttribute("nome", login);
//		return "index";
//	}
//	else {
//		modelMap.addAttribute("error", "Usuario Inválido");
//		return "loginForm";
//		
//	}
//
//}
//}
//@RequestMapping("logout")
//public String logout(HttpSession session) {
//    session.invalidate();
//    return "redirect:loginForm";
//}

//private UsuarioRepository repository;
//
//public AutenticacaoUsuarioController(UsuarioRepository repository) {
//	this.repository = repository;
//}
		
		