package dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hotel_H.Hospede;
import hotel_H.Hotel;

public class HotelDAO {

	public void inserirHotel(Hotel hotel) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		
		String sql = "INSERT INTO hotel (id_endereco, nome, cnpj) values (?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
				
		st.setInt(1, hotel.getEndereco());
		st.setString(2, hotel.getNome());
		st.setString(3, hotel.getCnpj());
		
		st.execute();
		System.out.println("Hotel criado com sucesso.");
		
		st.close();
		conn.close();
	}
	
	public void consultarHotel() throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "SELECT * FROM hotel";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<Hotel> hoteis = new ArrayList<>();
		
		while(rs.next()) {
			Hospede hoteis = new Hotel(
					rs.get
					rs.getInt("id_hospede"),
					rs.getString("nome"),
					rs.getString("nome"),
			);
			hospedes.add(hospede);
		}
		
		hospedes.forEach(hospede -> System.out.println(hospede));
		
		rs.close();
		st.close();
		conn.close();
	}
	
	public void deletaHospede(int id) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "DELETE FROM hospede WHERE id = ?";
		PreparedStatement st = conn.prepareStatement(sql);

		st.setInt(1, id);
		st.execute();
		
		System.out.println("Hospede deletado com sucesso.");

		st.close();
		conn.close();
	}
	
	public void updateHospede(Hospede hospede) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "UPDATE hospede SET id_endereco = ?, email = ?, nome = ?, cpf = ?, dtNascimento = ?, telefone = ? WHERE id = ?";
		PreparedStatement st = conn.prepareStatement(sql);

		st.setInt(1, hospede.getEndereco());
		st.setString(2, hospede.getEmail());
		st.setString(3, hospede.getNome());
		st.setString(4, hospede.getCpf());
		st.setDate(5, Date.valueOf(hospede.getNascimento()));
		st.setString(6, hospede.getTelefone());
		st.setInt(8, hospede.getId());
		
		st.execute();
		
		System.out.println("Hospede atualizado.");

		st.close();
		conn.close();
	}
}