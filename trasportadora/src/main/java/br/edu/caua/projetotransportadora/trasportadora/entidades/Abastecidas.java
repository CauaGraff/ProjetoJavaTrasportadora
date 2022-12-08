package br.edu.caua.projetotransportadora.trasportadora.entidades;

import java.io.Serializable;


public class Abastecidas implements Serializable {

	private static final long serialVersionUID = 1L;

	
	
	// ATRIBUTOS
	
	private Float valor;
	
	private String tipoProduto;
	
	private Integer quantidade;
	
	// METODOS GET E SET
	
	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}