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
import hotel_H.Servico;
import infra.ConnectionFactory;

public class HotelDAO {

	public void inserirHotel(Hotel hotel) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		
		String sql = "INSERT INTO hotel (id_endereco, nome, cnpj) VALUES (?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
				
		st.setString(1, hotel.getEndereco());
		st.setString(2, hotel.getNome());
		st.setString(3, hotel.getCnpj());
		
		st.execute();
		System.out.println("Hotel criado com sucesso.");
		
		st.close();
		conn.close();
	}
	
	public void deletarHotel(int id) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "DELETE FROM hotel WHERE id = ?";
		
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		st.execute();
		
		System.out.println("Serviço deletado com sucesso!");
		
		st.close();
		conn.close();
	}
	
	public void atualizarHotel(Hotel hotel) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "UPDATE hotel SET nome = ?, cnpj = ? WHERE id = ?";

		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, hotel.getNome());
		st.setString(2, hotel.getCnpj());
		
		st.execute();
		System.out.println("Servico atualizado com sucesso!");
		st.close();
		conn.close();
	}	
	
	}