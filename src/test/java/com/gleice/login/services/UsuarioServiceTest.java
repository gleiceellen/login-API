package com.gleice.login.services;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.gleice.login.models.Usuario;
import com.gleice.login.util.Mensagem;

import utils.ExistingEmailException;

@RunWith(SpringRunner.class)
public class UsuarioServiceTest {
	
	@InjectMocks
	private UsuarioService usuarioService;

	@InjectMocks
	private Mensagem mensagem;
	
	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExceptionCasoUsuarioSejaNulo() {
		Usuario usuario = null;
		usuarioService.salvar(usuario);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExceptionCasoUsuarioNãoContenhaTodosAtributos() {
		Usuario gleice = new Usuario("Gleice", "gleice@hotmail.com", "123");
		gleice.setEmail("");
		usuarioService.salvar(gleice);
	}
	
	@Test
	public void deveRetornarExceptionCasoEmailExistente() {
		
	}
	
	
}
