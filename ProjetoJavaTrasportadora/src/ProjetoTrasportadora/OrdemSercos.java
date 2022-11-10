package ProjetoTrasportadora;

import java.io.Serializable;

public class OrdemSercos implements Serializable{
	
	private static final long serialVersionUID = 1L;


	// ATRIBUTOS
	
	private String origem;
	
	private String destino;
	
	private Float kmViagem;
	
	private Float valor;
	
	// METODOS GET E SET

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Float getKmViagem() {
		return kmViagem;
	}

	public void setKmViagem(Float kmViagem) {
		this.kmViagem = kmViagem;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	
	
}
