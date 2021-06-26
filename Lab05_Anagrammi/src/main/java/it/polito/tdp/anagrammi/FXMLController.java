package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;


import it.polito.tdp.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtAnagrammiCorretti;

    @FXML
    private TextArea txtAnagrammiErrati;

    @FXML
    void calcolaAnagrammi(ActionEvent event) {
    	String parolaInserita = txtParola.getText();

    	String elencoAnagrammiCorretti = "";
    	String elencoAnagrammiErrati = "";
    	for(String s:model.anagrammi(parolaInserita)) {
    		if(model.getDao().isCorrect(s)) {
    		elencoAnagrammiCorretti = elencoAnagrammiCorretti + s +"\n";
    		txtAnagrammiCorretti.setText(elencoAnagrammiCorretti);
    		}else {
    			elencoAnagrammiErrati = elencoAnagrammiErrati + s +"\n";
    			txtAnagrammiErrati.setText(elencoAnagrammiErrati);
    		}
    	}
    	
    	
    	
    	
    	

    }

    @FXML
    void doReset(ActionEvent event) {
    	txtParola.clear();
    	txtAnagrammiErrati.clear();
    	txtAnagrammiCorretti.clear();

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAnagrammiErrati != null : "fx:id=\"txtAnagrammiErrati\" was not injected: check your FXML file 'Scene.fxml'.";

    }

	public void setModel(Model model) {
		this.model=model;
		
	}
}
