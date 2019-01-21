package com.gleice.login.models;

import java.util.List;
import java.util.UUID;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String email;
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="phones", 
        joinColumns = @JoinColumn(name = "id"))
    @Column(name="codigo_phone")
	private List<String> phones;

	public Usuario(String nome, String email, String password) {
	        this.nome = nome;
	        this.email = email;
	        this.password = password;
	    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
}
