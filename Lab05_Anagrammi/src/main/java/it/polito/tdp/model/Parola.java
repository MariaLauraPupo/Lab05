package it.polito.tdp.model;

public class Parola {
	private int lunghezza;
	private String nome;
	
	
	public Parola(int lunghezza, String nome) {
		super();
		this.lunghezza = lunghezza;
		this.nome = nome;
	}


	public int getLunghezza() {
		return lunghezza;
	}


	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
