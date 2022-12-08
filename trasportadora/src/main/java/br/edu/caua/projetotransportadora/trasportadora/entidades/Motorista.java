package br.edu.caua.projetotransportadora.trasportadora.entidades;

import java.io.Serializable;
import java.util.Date;

public class Motorista implements Serializable {

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS

	private Integer id;

	private String nome;

	private Date dataNasc;
	
	private String endereco;

	private String cpf;

	private String cnh;

	// METODOS GET E SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
