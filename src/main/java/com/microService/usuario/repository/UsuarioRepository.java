package com.microService.usuario.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microService.usuario.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

}
