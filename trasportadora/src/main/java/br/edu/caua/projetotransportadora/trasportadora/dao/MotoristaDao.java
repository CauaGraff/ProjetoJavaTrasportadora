package br.edu.caua.projetotransportadora.trasportadora.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.caua.projetotransportadora.trasportadora.database.MysqlSingleton;
import br.edu.caua.projetotransportadora.trasportadora.entidades.Motorista;

public class MotoristaDao {
	private Connection connection;

	public MotoristaDao() {
		this.connection = MysqlSingleton.getConnection();
	}

	public boolean inserir(Motorista motorista) {
		String sql = "INSERT INTO motorista(nome, dataNasc, endereco, cpf, cnh) VALUES (?, ?, ?, ?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, motorista.getNome());
			stmt.setDate(2, (Date) motorista.getDataNasc());
			stmt.setString(3, motorista.getEndereco());
			stmt.setString(4, motorista.getCpf());
			stmt.setString(5, motorista.getCnh());
			stmt.execute();
			return true;

		} catch (Exception e) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, e);
			return false;
		}
	}

	public List<Motorista> listar() {
		String sql = "SELECT * FROM  motorista";
		List<Motorista> listaMotorista = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				Motorista motorista = new Motorista();
				motorista.setId(resultado.getInt("id"));
				motorista.setNome(resultado.getString("nome"));
				motorista.setDataNasc(resultado.getDate("dataNasc"));
				motorista.setEndereco(resultado.getString("endereco"));
				motorista.setCpf(resultado.getString("cpf"));
				motorista.setCnh(resultado.getString("cnh"));
				listaMotorista.add(motorista);
			}
		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return listaMotorista;
	}

	public boolean alterar(Motorista motorista) {
		String sql = "UPDATE motorista SET nome=?, dataNasc=?, endereco=?, cpf=?, cnh=? WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, motorista.getNome());
			stmt.setDate(2, (Date) motorista.getDataNasc());
			stmt.setString(3, motorista.getEndereco());
			stmt.setString(4, motorista.getCpf());
			stmt.setString(5, motorista.getCnh());
			stmt.setInt(6, motorista.getId());
			stmt.execute();
			return true;
		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public boolean remover(Motorista motorista) {
		String sql = "DELETE FROM motorista WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, motorista.getId());
			stmt.execute();
			return true;
		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	public Motorista buscar(Integer id) {
		String sql = "SELECT * FROM motorista WHERE id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet resultado = stmt.executeQuery();
			Motorista motorista = new Motorista();
			if (resultado.next()) {
				motorista.setId(resultado.getInt("id"));
				motorista.setNome(resultado.getString("nome"));
				motorista.setDataNasc(resultado.getDate("dataNasc"));
				motorista.setEndereco(resultado.getString("endereco"));
				motorista.setCpf(resultado.getString("cpf"));
				motorista.setCnh(resultado.getString("cnh"));
				return motorista;
			}
		} catch (SQLException ex) {
//			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

}
