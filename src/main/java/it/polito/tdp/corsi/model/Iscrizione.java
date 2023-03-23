package it.polito.tdp.corsi.model;

public class Iscrizione {
	
	private String matricola;
	private String codIns;
	
	public Iscrizione(String matricola, String codIns) {
		super();
		this.matricola = matricola;
		this.codIns = codIns;
	}

	/**
	 * @return the matricola
	 */
	public String getMatricola() {
		return matricola;
	}

	/**
	 * @param matricola the matricola to set
	 */
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	/**
	 * @return the codIns
	 */
	public String getCodIns() {
		return codIns;
	}

	/**
	 * @param codIns the codIns to set
	 */
	public void setCodIns(String codIns) {
		this.codIns = codIns;
	}

	@Override
	public String toString() {
		return "Iscrizione [matricola=" + matricola + ", codIns=" + codIns + "]";
	}
	
	
}
