package com.microService.usuario.model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIOS")
public class UsuarioModel implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID usuarioId;
	private String nome;
	private String email;
	public UsuarioModel(UUID usuarioId, String nome, String email) {
		
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.email = email;
	}
	public UsuarioModel() {
		
	}
	public UUID getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(UUID usuarioId) {
		this.usuarioId = usuarioId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
