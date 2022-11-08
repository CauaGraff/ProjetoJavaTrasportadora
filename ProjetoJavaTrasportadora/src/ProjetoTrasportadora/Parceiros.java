package ProjetoTrasportadora;

public class Parceiros {

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
