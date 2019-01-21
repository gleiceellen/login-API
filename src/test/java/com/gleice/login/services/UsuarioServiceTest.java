package com.gleice.login.services;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.gleice.login.models.Usuario;
import com.gleice.login.util.Mensagem;

@RunWith(SpringRunner.class)
public class UsuarioServiceTest {

	private Usuario gleice;
	@InjectMocks
	private UsuarioService usuarioService;

	@InjectMocks
	private Mensagem mensagem;

	@Before
	public void init() {
		this.gleice = new Usuario("Gleice", "gleice@hotmail.com", "123");
	}

	@Test(expected = IllegalArgumentException.class)
	public void deveRetornarExceptionCasoUsuarioSejaNulo() {
		Usuario usuario = null;

		usuarioService.salvar(usuario);

	}


}
