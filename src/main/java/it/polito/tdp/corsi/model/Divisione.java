package it.polito.tdp.corsi.model;

public class Divisione {

	private String CDS;
	private Integer nStudenti;
	
	public Divisione(String cDS, Integer nStudenti) {
		super();
		CDS = cDS;
		this.nStudenti = nStudenti;
	}

	/**
	 * @return the cDS
	 */
	public String getCDS() {
		return CDS;
	}

	/**
	 * @return the nStudenti
	 */
	public Integer getnStudenti() {
		return nStudenti;
	}
	
	
	
}
