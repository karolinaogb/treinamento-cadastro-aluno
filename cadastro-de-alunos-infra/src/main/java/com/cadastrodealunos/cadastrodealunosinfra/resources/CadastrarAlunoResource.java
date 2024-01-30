package com.cadastrodealunos.cadastrodealunosinfra.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastrodealunos.cadastrodealunosinfra.entities.CadastrarAluno;

@RestController
@RequestMapping(value = "/cadastroAluno")
public class CadastrarAlunoResource {
	
	@GetMapping
	public ResponseEntity< CadastrarAluno > findAll(){
		CadastrarAluno aluno = new CadastrarAluno (1L, null, 0, null, null, null, null);
		return ResponseEntity.ok().body(aluno);
	}
}
