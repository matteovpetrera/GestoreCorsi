package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Divisione;
import it.polito.tdp.corsi.model.Studente;

public class StudenteDAO {

	
	public List<Studente> getIscrittiCorso(String codIns){
		
		String sql = "SELECT s.matricola, s.cognome, s.nome, s.CDS "
				+ "FROM studente s, iscrizione i "
				+ "WHERE s.matricola = i.matricola AND i.codins = ?";
		
		List<Studente> risultato = new ArrayList<Studente>();
		
		Connection con = ConnectDb.getConnection();
		try {
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, codIns);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				risultato.add(new Studente(rs.getInt("matricola"), rs.getString("cognome"), rs.getString("nome"), rs.getString("CDS")));
			}
			
			rs.close();
			st.close();
			con.close();
			
			return risultato;
			
		} catch (SQLException e) {
			System.err.println("errore nel DAO");
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Divisione> getDivisioneStudentiCorso(String codIns){
		
		String sql = "SELECT s.CDS, COUNT(*) AS n "
				+ "FROM studente s, iscrizione i "
				+ "WHERE s.matricola = i.matricola AND i.codins = ? "
				+ "GROUP BY s.CDS";
		
		List<Divisione> risultato = new ArrayList<Divisione>();
		
		Connection conn = ConnectDb.getConnection();
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, codIns);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				risultato.add(new Divisione(rs.getString("CDS"), rs.getInt("n")));
			}
			
			rs.close();
			st.close();
			conn.close();
			
			return risultato;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
