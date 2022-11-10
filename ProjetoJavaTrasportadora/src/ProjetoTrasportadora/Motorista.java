package ProjetoTrasportadora;

import java.io.Serializable;
import java.util.Date;

public class Motorista implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	// ATRIBUTOS
	
	private String nome;
	
	private Date dataNasc;
	
	private String endereco;
	
	private Number cpf;
	
	private Number cnh;
	
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

	public Number getCpf() {
		return cpf;
	}

	public void setCpf(Number cpf) {
		this.cpf = cpf;
	}

	public Number getCnh() {
		return cnh;
	}

	public void setCnh(Number cnh) {
		this.cnh = cnh;
	}
	
	

}
