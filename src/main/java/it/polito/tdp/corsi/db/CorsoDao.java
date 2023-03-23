package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Corso;
import it.polito.tdp.corsi.model.Iscrizione;

public class CorsoDao {

	
	public List<Corso> getCorsiByPeriodo(int periodo) {
		
		List<Corso> resultCorso = new ArrayList<>();
		
		
		String sql = "SELECT * "
				+ "FROM corso "
				+ "WHERE pd = ?";
		try {
			
			Connection conn = ConnectDb.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, periodo);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Corso c = new Corso(rs.getString("codins"),rs.getInt("crediti"),rs.getString("nome"),rs.getInt("pd"));
				resultCorso.add(c);
			}
			
			st.close();
			rs.close();
			conn.close();
			
			return resultCorso;
			
		}catch(SQLException e){
			System.err.println("errore nel DAO");
			e.printStackTrace();
			return null;
		}
		
	}
	
	public int getNumeroStudentiByPeriodo(int periodo) {
		
		//List<Iscrizione> resultIscritti = new ArrayList<>();
		
		String sql = "SELECT c.codins, c.crediti, c.nome, c.pd, COUNT(*) "
				+ "FROM corso c, iscrizione i "
				+ "WHERE c.codins = i.codins and pd = ? "
				+ "GROUP BY c.codins, c.crediti, c.nome, c.pd";
		
		int count = 0;
		
		try {
			Connection conn = ConnectDb.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, periodo);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				count = count + rs.getInt("COUNT(*)");
			}
			
			st.close();
			rs.close();
			conn.close();
			
			return count;
			
		}catch(SQLException e) {
			System.err.println("Errore nel DAO");
			e.printStackTrace();
			return 0;
		}
		
	}
}
