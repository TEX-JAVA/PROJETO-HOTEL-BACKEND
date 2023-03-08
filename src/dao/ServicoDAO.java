package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import hotel_H.Servico;

public class ServicoDAO {
	
	public void inserirServico(String nome, String descricao, double valor) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "insert into servico(nome, descricao, valor) values (?, ?, ?)";
		PreparedStatement st = conn.prepareStatement(sql);
		
		
		st.setString(1, nome);
		st.setString(2, descricao);
		st.setDouble(3, valor);
		
		st.execute();
		System.out.println("Serviço inserido com sucesso!");
		
		st.close();
		conn.close();
	}
	
	public void consultarServicos() throws SQLException{
		Connection conn = ConnectionFactory.connect();

		String sql = "select * from servico";
		PreparedStatement st = conn.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<Servico> servicos = new ArrayList<>();
		
		while(rs.next()) {
			Servico servico = new Servico(
			rs.getInt("id"),
			rs.getString("nome"),
			rs.getString("descricao"),
			rs.getDouble("valor")
			);
			servicos.add(servico);
		}
		
		servicos.forEach(servico -> System.out.println(servico));	
		
		rs.close();
		st.close();
		conn.close();
		
	}
	
	public void deletarServico(int id) throws SQLException {
		Connection conn = ConnectionFactory.connect();
		String sql = "delete from servico where id = ?";
		
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		
		System.out.println("Serviço deletado com sucesso!");
		
		st.close();
		conn.close();
	}
	public void atuaServico() throws SQLException {
		Connection conn = ConnectionFactory.connect();
		
		conn.close();
	}
	
}
