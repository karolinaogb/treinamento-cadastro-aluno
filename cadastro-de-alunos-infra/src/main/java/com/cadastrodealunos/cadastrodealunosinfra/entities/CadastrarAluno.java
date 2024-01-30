package com.cadastrodealunos.cadastrodealunosinfra.entities;

import java.io.Serializable;
import java.util.Objects;

public class CadastrarAluno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private long rg;
	private String sexo;
	private String estadoCivil;
	private String dataDeNascimento;
	private String observacao;
	
	public CadastrarAluno () {
	}
	
	public CadastrarAluno(long id, String name, long rg, String sexo, String estadoCivil, String dataDeNascimento,
			String observacao) {
		super();
		this.id = id;
		this.name = name;
		this.rg = rg;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.dataDeNascimento = dataDeNascimento;
		this.observacao = observacao;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastrarAluno other = (CadastrarAluno) obj;
		return id == other.id;
	}
	
}
