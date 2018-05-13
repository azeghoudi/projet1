package projet1.controleur;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import projet1.modele.Jeu;

public class ControleurJeu implements Initializable {
	
	private Jeu nouveauJeu;

    @FXML
    private Pane console;

    @FXML
    private TilePane terrain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}