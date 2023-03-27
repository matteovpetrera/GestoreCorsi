package it.polito.tdp.corsi.model;

public class Studente {

	private Integer matricola;
	private String cognome;
	private String nome;
	private String CDS;
	
	public Studente(Integer matricola, String cognome, String nome, String cDS) {
		super();
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		CDS = cDS;
	}

	/**
	 * @return the matricola
	 */
	public Integer getMatricola() {
		return matricola;
	}

	/**
	 * @param matricola the matricola to set
	 */
	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cDS
	 */
	public String getCDS() {
		return CDS;
	}

	/**
	 * @param cDS the cDS to set
	 */
	public void setCDS(String cDS) {
		CDS = cDS;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", cognome=" + cognome + ", nome=" + nome + ", CDS=" + CDS + "]";
	}
	
	
	
}
