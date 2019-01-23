package com.gleice.login.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gleice.login.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
	@Query(value="SELECT u FROM Usuario u WHERE u.email LIKE %?1%")
    public List<Usuario> filtrarPorEmail(String email);
	
	@Query(value="SELECT u FROM Usuario u WHERE u.email=?1 and u.password=?2")
    public List<Usuario> filtrarPorEmailESenha(String email, String password);
}
