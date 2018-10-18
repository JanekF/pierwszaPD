package application;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {

	@FXML CheckBox przycisk;
	@FXML Button tu;
	@FXML Label etykietka;
	@FXML public void metoda(ActionEvent event) {}
	@FXML public void metoda2(ActionEvent event) {
		etykietka.setText("tatatata");
		
	}
		
	

	
}
