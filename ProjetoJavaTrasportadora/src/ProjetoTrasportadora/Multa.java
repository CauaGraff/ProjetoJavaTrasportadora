package ProjetoTrasportadora;

import java.util.Date;

public class Multa {
	
	// ATRIBUTOS
	
	private String tipo;
	
	private String local;
	
	private Date data;

	// METODOS GET E SET
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	
	
}
