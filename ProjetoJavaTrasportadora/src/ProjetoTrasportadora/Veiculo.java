package ProjetoTrasportadora;

import java.io.Serializable;
import java.util.Date;

public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	//ATRIBUTOS
	private String placa;
	
	private Float kilometragem;
	
	private String cor;
	
	private Date data;
	
	private String tipo;
	
	private Number numChassi;
	
	// METODOS GET E SET
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Float getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Float kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Number getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(Number numChassi) {
		this.numChassi = numChassi;
	}
	
}
