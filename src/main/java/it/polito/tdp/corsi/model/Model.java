package it.polito.tdp.corsi.model;

import java.util.List;

import it.polito.tdp.corsi.db.CorsoDao;
import it.polito.tdp.corsi.db.StudenteDAO;

public class Model {
	
	private CorsoDao corsoDao;
	private StudenteDAO studenteDao;
	
	public Model() {
		this.corsoDao = new CorsoDao();
		this.studenteDao = new StudenteDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(int periodo){
		return this.corsoDao.getCorsiByPeriodo(periodo);
	}
	
	public int getNumeroStudentiByPeriodo(int periodo) {
		return this.corsoDao.getNumeroStudentiByPeriodo(periodo);
	}
	
	public List<Studente> getIscrittiCorso(String codIns){
		return this.studenteDao.getIscrittiCorso(codIns);
	}
	
	public List<Divisione> getDivisioneIscrittiCorso(String codIns){
		return this.studenteDao.getDivisioneStudentiCorso(codIns);
	}
}
