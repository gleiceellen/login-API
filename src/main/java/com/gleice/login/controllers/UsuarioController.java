package com.gleice.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gleice.login.controllers.response.Resposta;
import com.gleice.login.models.Usuario;
import com.gleice.login.services.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(value="criar", consumes="application/json", produces="application/json")
	public Resposta salva(@RequestBody Usuario usuario) {	
		try {
			Usuario user = usuarioService.salvar(usuario);
			return new Resposta(user);
		}catch (Exception e) {
			return new Resposta(e.getMessage(), HttpStatus.BAD_REQUEST);
		}	
	}
	
	@PostMapping(value="logar", consumes="application/json", produces="application/json")
	public Resposta login(@RequestBody Usuario usuario) {	
		try {
			Usuario user = usuarioService.logar(usuario);
			return new Resposta(user);
		}catch (Exception e) {
			return new Resposta(e.getMessage(), HttpStatus.BAD_REQUEST);
		}	
	}
	
	@PostMapping(value="perfil", consumes="application/json", produces="application/json")
	public Resposta perfil(@RequestBody Usuario usuario) {	
		try {
			Usuario user = usuarioService.perfil(usuario);
			return new Resposta(user);
		}catch (Exception e) {
			return new Resposta(e.getMessage(), HttpStatus.BAD_REQUEST);
		}	
	}
}
