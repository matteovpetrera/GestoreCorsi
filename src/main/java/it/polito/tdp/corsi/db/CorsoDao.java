package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Corso;

public class CorsoDao {

	
	public List<Corso> getCorsiByPeriod(int periodo) {
		
		List<Corso> resultCorso = new ArrayList<>();
		Connection conn = ConnectDb.getConnection();
		
		return null;
	}
}
