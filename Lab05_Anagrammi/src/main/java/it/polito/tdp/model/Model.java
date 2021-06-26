package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.DAO.AnagrammaDAO;

public class Model {
	
	AnagrammaDAO dao = new AnagrammaDAO();

	public List<String> anagrammi(String parola){
		List<String> risultato = new ArrayList<String>();
		permuta("", parola, 0, risultato);
		return risultato;
	}



	private void permuta(String parziale, String lettere, int L, List<String> risultato) {
		//caso terminale
		if(lettere.length() == 0) {
			//la soluzione parziale è anche la soluzione completa
			risultato.add(parziale);
		}else {
			for(int pos=0; pos<lettere.length(); pos++) {
				char tentativo = lettere.charAt(pos);
				String nuovaParziale = parziale + tentativo;
				//tolgo il carattere 'pos' da 'lettere'
				String nuovaLettere = lettere.substring(0, pos)+lettere.substring(pos+1);
				permuta(nuovaParziale, nuovaLettere, L+1, risultato);
			}
		}
		
	}
	public AnagrammaDAO getDao() {
		return dao;
	}
	
}
