package it.polito.tdp.corsi.model;

import java.util.Objects;

public class Corso {
	
	private String codIns;
	private int crediti;
	private String nome;
	private int pt;
	
	public Corso(String codIns, int crediti, String nome, int pt) {
		super();
		this.codIns = codIns;
		this.crediti = crediti;
		this.nome = nome;
		this.pt = pt;
	}

	public String getCodIns() {
		return codIns;
	}

	public void setCodIns(String codIns) {
		this.codIns = codIns;
	}

	public int getCrediti() {
		return crediti;
	}

	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPt() {
		return pt;
	}

	public void setPt(int pt) {
		this.pt = pt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codIns);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corso other = (Corso) obj;
		return Objects.equals(codIns, other.codIns);
	}

	@Override
	public String toString() {
		return "Corso [codIns=" + codIns + ", crediti=" + crediti + ", nome=" + nome + ", pt=" + pt + "]";
	}

	
	
	
	
}
