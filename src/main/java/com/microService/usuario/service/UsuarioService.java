package com.microService.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microService.usuario.model.UsuarioModel;
import com.microService.usuario.produtor.UsuarioProdutor;
import com.microService.usuario.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	UsuarioProdutor usuarioProdutor;
	
	@Transactional
	public UsuarioModel save(UsuarioModel usuarioModel) {
		usuarioModel = usuarioRepository.save(usuarioModel);
		usuarioProdutor.publicarMensagemEmail(usuarioModel);
		return usuarioModel;
	}
	
}
