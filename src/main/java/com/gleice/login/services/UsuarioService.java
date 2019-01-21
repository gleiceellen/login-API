package com.gleice.login.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleice.login.models.Usuario;
import com.gleice.login.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public void salvar(Usuario usuario) {
		if(usuario == null) throw new IllegalArgumentException();

		usuarioRepository.save(usuario);
	}

}
