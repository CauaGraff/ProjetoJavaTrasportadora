package ProjetoTrasportadora;

import java.io.Serializable;

public class Parceiros implements Serializable{
	
	private static final long serialVersionUID = 1L;


	// ATIBUTOS
	
	private String razaoSocial;
	
	private String servoPrestado;
	
	private Number cnpj;
	
	private String produto;

	// METODOS GET E SET
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getServoPrestado() {
		return servoPrestado;
	}

	public void setServoPrestado(String servoPrestado) {
		this.servoPrestado = servoPrestado;
	}

	public Number getCnpj() {
		return cnpj;
	}

	public void setCnpj(Number cnpj) {
		this.cnpj = cnpj;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	
}
