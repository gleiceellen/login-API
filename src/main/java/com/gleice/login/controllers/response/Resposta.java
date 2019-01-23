package com.gleice.login.controllers.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.gleice.login.models.Usuario;

@JsonAutoDetect(fieldVisibility=Visibility.ANY)
public class Resposta {

    private Usuario usuario;
    private String mensagem;
    
	public Resposta(Usuario usuario) {
    	this.usuario = usuario;
    }
    
    public Resposta(String mensagem) {
    	this.mensagem = mensagem;
    }

    
    public Usuario getUsuario() {
		return usuario;
	}

	public String getMensagem() {
		return mensagem;
	}


}
