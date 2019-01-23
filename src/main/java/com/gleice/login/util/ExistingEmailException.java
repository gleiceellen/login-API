package com.gleice.login.util;

public class ExistingEmailException extends RuntimeException{


	public ExistingEmailException(String mensagem) {
		super(mensagem);
	}
}
