package com.gleice.login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleice.login.models.Usuario;
import com.gleice.login.repositories.UsuarioRepository;

import utils.ExistingEmailException;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public void salvar(Usuario usuario) throws ExistingEmailException {
		if(usuario == null || usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getPassword().isEmpty())
			throw new IllegalArgumentException();
		
		List<Usuario> usuarios = this.lista();
		
		for(Usuario usu : usuarios) {
			if(usu.getEmail().equals(usuario.getEmail()))
				throw new ExistingEmailException(usuario);
		}

			usuarioRepository.save(usuario);
	}
	
	public List<Usuario> lista(){
		return (List<Usuario>) usuarioRepository.findAll();
	}

}
