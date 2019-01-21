package com.gleice.login.util;

public class Mensagem {
	private String mensagem;
	private String mensagemErro;
	
	public Mensagem(String mensagem, String mensagemErro) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

}
