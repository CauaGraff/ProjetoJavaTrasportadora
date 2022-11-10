package ProjetoTrasportadora;

import java.io.Serializable;

public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	
	
	// ATRIBUTOS
	
	private String tipo;
	
	private Float valor;
	
	private String nf;
	
	private String cte;
	
	// METODOS GET E SET

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getNf() {
		return nf;
	}

	public void setNf(String nf) {
		this.nf = nf;
	}

	public String getCte() {
		return cte;
	}

	public void setCte(String cte) {
		this.cte = cte;
	}
	
	
	
	
}
