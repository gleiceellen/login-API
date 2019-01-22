package utils;

import com.gleice.login.models.Usuario;

public class ExistingEmailException extends RuntimeException{
	
	public static final String EMAIL_EXISTENTE_MSG = "Email já existe!";
	 
    public ExistingEmailException(Usuario usuario) {
        super(String.format(EMAIL_EXISTENTE_MSG, usuario.getEmail()));
         
    }

}
