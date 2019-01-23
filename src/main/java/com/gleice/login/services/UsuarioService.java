package com.gleice.login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleice.login.models.Usuario;
import com.gleice.login.repositories.UsuarioRepository;
import com.gleice.login.util.ExistingEmailException;
import com.gleice.login.util.LoginAPIException;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario salvar(Usuario usuario){
		if(usuario == null || usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getPassword().isEmpty())
			throw new IllegalArgumentException();
		if(emailExiste(usuario)){
			throw new ExistingEmailException("Email não existe!");
			
		}
			return usuarioRepository.save(usuario);
		
	}
	
	public List<Usuario> lista(){
		return (List<Usuario>) usuarioRepository.findAll();
	}
	
	public boolean emailExiste(Usuario usuario) {
		if(!usuarioRepository.filtrarPorEmail(usuario.getEmail()).isEmpty()) {
			return true;
		}
		return false;
	}

	public Usuario logar(Usuario usuario) {
		List<Usuario> user = usuarioRepository.filtrarPorEmailESenha(usuario.getEmail(), usuario.getPassword());
		if(user.isEmpty())
			throw new LoginAPIException("Usuário não existe!");
		Usuario usuarioLogado = user.get(0);
		usuarioLogado.criarToken();
		return usuarioLogado;
	}

}
