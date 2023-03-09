package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import hotel_H.Servico;
import infra.ConnectionFactory;

public class ServicoDAO {
	
	public void inserirServico(Servico servico) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "INSERT INTO servico(nome, descricao, valor) VALUES (?, ?, ?)";
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setString(1, servico.getNome());
		st.setString(2, servico.getDescricao());
		st.setDouble(3, servico.getValor());
		
		st.execute();
		System.out.println("Serviço inserido com sucesso!");
		
		st.close();
		conn.close();
	}
	
	public void consultarServicos() throws SQLException{
		Connection conn = ConnectionFactory.connect();

		String sql = "SELECT * FROM servico";
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
		String sql = "DELETE FROM servico WHERE id = ?";
		
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		st.execute();
		
		System.out.println("Serviço deletado com sucesso!");
		
		st.close();
		conn.close();
	}
	public void atualizarServico(Servico servico) throws SQLException {
		Connection conn = ConnectionFactory.connect();
		String sql = "UPDATE servico SET nome = ?, descricao = ?, valor = ? WHERE id = ?";

		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, servico.getNome());
		st.setString(2, servico.getDescricao());
		st.setDouble(3, servico.getValor());
		st.setInt(4, servico.getId());
		
		st.execute();
		System.out.println("Servico atualizado com sucesso!");
		st.close();
		conn.close();
	}
	
}
