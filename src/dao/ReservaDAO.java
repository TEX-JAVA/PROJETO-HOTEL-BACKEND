package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hotel_H.Hospede;
import hotel_H.Quarto;
import hotel_H.Reserva;
import infra.ConnectionFactory;

public class ReservaDAO {

	public void inserirReserva(Reserva reserva) throws SQLException {
		Connection conn = ConnectionFactory.connect();
		String sql = "insert into reserva(datareserva,dataCheckin,dataCheckout, valorTotal,qtdHospede, qtdDias)"
				+ "values(?,?,?,?,?,?)";
		
		
		PreparedStatement st = conn.prepareStatement(sql);
		//Irá gerar o código id cadastrado no banco
		st.setDate(1, Date.valueOf(reserva.getDataReserva()));
		st.setDate(2, Date.valueOf(reserva.getCheckin()));
		st.setDate(3, Date.valueOf(reserva.getCheckout()));
		st.setDouble(4, reserva.getValorTotal());
		st.setInt(5, reserva.getQtdPessoas());
		st.setInt(6, reserva.getQtdDias());
		
		
		int resultado = st.executeUpdate();
		if(resultado==1) {
			System.out.println("Reserva cadastrada com sucesso!");
		}else {
			System.out.println("Reserva não efetuada");
		}
	}

	public void consultarReserva() throws SQLException {
		Connection conn = ConnectionFactory.connect();
		String sql = "SELECT * FROM reserva";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<Reserva> reservas = new ArrayList<>();
		while(rs.next()) {
			Reserva reserva = new Reserva(
					rs.getInt("id_reserva"),
					rs.getDate("datareserva").toLocalDate(),
					rs.getDate("dataCheckin").toLocalDate(),
					rs.getDate("dataCheckout").toLocalDate(),
					rs.getInt("qtdHospede"),				
					rs.getDouble("valorTotal"),
					rs.getInt("qtdDias")
			);
			reservas.add(reserva);			
		}		
		reservas.forEach(reserva -> System.out.println(reserva));
		
		rs.close();
		st.close();
		conn.close();
	}
	
	public void deletaReserva(Reserva reserva) throws SQLException{
		Connection conn = ConnectionFactory.connect();
		String sql = "DELETE FROM reserva WHERE id_reserva = ?";
		PreparedStatement st = conn.prepareStatement(sql);

		st.setInt(1, reserva.getIdReserva());
		int resultado = st.executeUpdate();
		
		if(resultado==1) {
			System.out.println("Reserva: "+reserva.getIdReserva()+" deletada com sucesso!");
		}else {
			System.out.println("Erro ao excluir reserva");
		}	

		st.close();
		conn.close();
	}

	public void atualizaReserva(Reserva reserva)throws SQLException{

		Connection conn = ConnectionFactory.connect();
		String sql = "UPDATE reserva SET datareserva = ?, dataCheckin = ?, dataCheckout = ?, qtdHospede = ?, valorTotal = ?, qtdDias = ? WHERE id_reserva = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setDate(1,Date.valueOf(reserva.getDataReserva()));
		st.setDate(2,Date.valueOf(reserva.getCheckin()));
		st.setDate(3, Date.valueOf(reserva.getCheckout()));
		st.setInt(4, reserva.getQtdPessoas());
		st.setDouble(5,reserva.getValorTotal());
		st.setInt(6,reserva.getQtdDias());
		st.setInt(7, reserva.getIdReserva());
		
		int resultado = st.executeUpdate();
		
		if( resultado == 1 ) {
			System.out.println("Reserva: "+reserva.getIdReserva()+" atualizada com sucesso!");
			
		}else {
			System.out.println("Erro de atualização");
		};
		
		
	}
}
