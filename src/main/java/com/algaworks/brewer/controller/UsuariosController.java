package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.brewer.model.Cliente;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	@RequestMapping("/novo")
	public String novo(Cliente cliente) {
		return "usuario/CadastroUsuario"; 
	}
}
