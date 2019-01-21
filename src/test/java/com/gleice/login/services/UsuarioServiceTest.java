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

	private Usuario gleice;
	private Usuario gleiceElen;
	@InjectMocks
	private UsuarioService usuarioService;

	@InjectMocks
	private Mensagem mensagem;
	
	@Rule
	public ExpectedException excecaoEsperada = ExpectedException.none();

	@Before
	public void init() {
		this.gleice = new Usuario("Gleice", "gleice@hotmail.com", "123");
		this.gleiceElen = new Usuario("Gleice", "gleice@hotmail.com", "123");
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExceptionCasoUsuarioSejaNulo() {
		Usuario usuario = null;
		usuarioService.salvar(usuario);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExceptionCasoUsuarioNãoContenhaTodosAtributos() {
		gleice.setEmail("");
		usuarioService.salvar(gleice);
	}
	
	@Test
	public void deveRetornarExceptionCasoEmailJaExistaNoCadastro() {
		usuarioService.salvar(gleiceElen);
		excecaoEsperada.expect(ExistingEmailException.class);
	    excecaoEsperada.expectMessage(String.format(ExistingEmailException.EMAIL_EXISTENTE_MSG, gleiceElen.getEmail()));
	}
	
}
