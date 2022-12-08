package br.edu.caua.projetotransportadora.trasportadora.entidades;

import java.io.Serializable;

public class Manutencao implements Serializable {
	
	private static final long serialVersionUID = 1L;


	// ATRIBUTOS
	
	private Integer id;
	
	private Integer contaId;
	
	private Float valor;
	
	private String data;

	// METODOS GET E SET
	
	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContaId() {
		return contaId;
	}

	public void setContaId(Integer contaId) {
		this.contaId = contaId;
	}

	


	
	
	
}


