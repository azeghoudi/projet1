package projetZelda.app;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
		FXMLLoader loader = new FXMLLoader(); 	
		
		// Lien du fichier fxml
		URL url = new File("src/projetZelda/vue/jeuZelda.fxml").toURI().toURL();	
		
		loader.setLocation(url);													
		System.out.println(loader.getLocation());							
		Pane root = new Pane(); 									
		root = loader.load();	
		
		// taille de la fenêtre
     	Scene scene = new Scene(root,600,400);
     	
		primaryStage.setScene(scene);												
		primaryStage.show();															
		} catch (Exception e) {
			e.printStackTrace();													
		}
	}
	
	// Lancement du jeu
	public static void main(String[] args) {
		launch(args);																	
	}
	
}
