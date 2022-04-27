package br.com.cursoja.agendacurso.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cursoja.agendacurso.model.entidade.Professor;

public class ProfessorDao extends Conexao {

	public void cadastrar(Professor p) {
		String sql = "insert into professor "+
						"(nome, celular, valorHora) values"+
						"(?,?,?)";
		try {
			PreparedStatement ps = getConexao().prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(3, p.getCelular());
			ps.setDouble(2, p.getValorHora());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Problema no insert");
			e.printStackTrace();
		}
		finally {
			fecharConexao();
		}
	}
	
	
}	
