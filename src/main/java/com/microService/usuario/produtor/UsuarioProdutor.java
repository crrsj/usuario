package com.microService.usuario.produtor;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.microService.usuario.dto.EmailDto;
import com.microService.usuario.model.UsuarioModel;

@Component
public class UsuarioProdutor {
final RabbitTemplate rabbitTemplate;
 
   

public UsuarioProdutor(RabbitTemplate rabbitTemplate) {
	super();
	this.rabbitTemplate = rabbitTemplate;
}

@Value(value = "${broker.queue.email.name}")
   private String routingKey;
   
   public void publicarMensagemEmail(UsuarioModel usuarioModel) {
	   var emailDto =  new EmailDto();
	   emailDto.setUsuarioId(usuarioModel.getUsuarioId());
	   emailDto.setEmailTo(usuarioModel.getEmail());
	   emailDto.setSubject("Cadastro efetuado com sucesso.");
	   emailDto.setNome(usuarioModel.getNome() + " seja bem vindo(a)!");
	   
	   rabbitTemplate.convertAndSend(routingKey,emailDto);
	   
   }
   
}
