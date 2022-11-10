package ProjetoTrasportadora;

import java.io.Serializable;
import java.util.Date;

public class Manutencao implements Serializable {
	
	private static final long serialVersionUID = 1L;


	// ATRIBUTOS
	
	private Float valor;
	
	private Date data;

	// METODOS GET E SET
	
	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}


