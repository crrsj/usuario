package com.microService.usuario.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosDeUsuario( @NotBlank String nome, @NotBlank @Email String email) {

}
