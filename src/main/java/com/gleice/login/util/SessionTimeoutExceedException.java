package com.gleice.login.util;

public class SessionTimeoutExceedException extends RuntimeException {
	public SessionTimeoutExceedException(String mensagem) {
		super(mensagem);
	}
}
