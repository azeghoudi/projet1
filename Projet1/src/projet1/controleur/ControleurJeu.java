package projet1.controleur;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import projet1.modele.Jeu;

public class ControleurJeu implements Initializable {
	
	private Jeu nouveauJeu;
	private int[][] tab;

    @FXML
    private Pane console;

    @FXML
    private TilePane terrain;
    
    @FXML
    void start(ActionEvent event) {
    	tab = nouveauJeu.initTerrain();
    	nouveauJeu.toString(tab);		
    } 
    
    public void creervueMap(tab) {
    	for (int i = 0; i < tab.length; i++) {
    		for (int j = 0; j < tab[].length; j++) {
    			terrain.getChildren().add(tab[i][j]);
    		}
    	}
    }
    
	public String imageDe(int i) {
		String img = "tiles_12.tsx";
		if (i == 210) { // 225, 26, 27, 28, 29, 30, 49, 50, 51, 52, 53, 54, 73, 74, 75, 76, 77, 78, 
			   // 97, 98, 99, 100, 101, 102, 265, 266, 267, 268, 32, 33, 34, 35, 56, 57, 58, 59, 80, 81, 82, 83,
				// 104, 105, 106, 107
			img = "";
			terrain.get;
		}
		else if (i == 1) {
			img = "";
		}
		else if (i == 2) {
			img = "";
		}
		else if (i == 3) {
			img = "";
		}
		else if (i == 4) {
			img = "";
		}
		else if (i == 5) {
			img = "";
		}
		else if (i == 6) {
			img = "";
		}
		return img;
	}
	
    	
    	
    	
    	
    	
    	
    	
    	
  /*  	String fichier ="003.json";
    	 
        String chaine="";
        
       //lecture du fichier texte
       try{
          InputStream ips=new FileInputStream(fichier);
          InputStreamReader ipsr=new InputStreamReader(ips);
          BufferedReader br=new BufferedReader(ipsr);
          String ligne;
          while ((ligne=br.readLine())!=null){
             System.out.println(ligne);
             chaine+=ligne+"\n";
          }
          br.close();
       }    
       catch (Exception e){
          System.out.println(e.toString());
       }
    }*/
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
}