package projet1.controleur;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import projet1.modele.Jeu;

public class ControleurJeu implements Initializable {
	
	Stage window;
	public Jeu nouveauJeu;
	private int[][] tab;
	private String image1 = "tiles_12.tsx";
	private final static Image image2 = new Image("src/projet1/img/tiles_12.png");
    	@FXML private Pane console;
    	@FXML private TilePane terrain;
    	@FXML private ImageView imgView;
    
	private final static int MROW = 20;
	private final static int MCOLUMN = 20;
	private ImageView[][] tileMapImage;

	public ControleurJeu() {
		nouveauJeu = new Jeu();
		int i;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		terrain.setPrefRows(MROW);
	        terrain.setPrefColumns(MCOLUMN);
	        
	        tab = nouveauJeu.initTerrain();
	        nouveauJeu.toString(tab);		
	    	    	
	    	
	    	BufferedImage maison;
		try {
			maison = ImageIO.read(new File("tiles_12.png").toURI().toURL()).getSubimage(32,32,0,0); 
			ImageView img1 = new ImageView();
		img1.setImage(SwingFXUtils.toFXImage(maison,null));
		terrain.getChildren().add(img1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    	
	    	
	}
	
    public void lireMap() {
    	for (int i = 0; i < this.tab.length; i++) {
    		for (int j = 0; j < this.tab[i].length; j++) {
    			
    		}
    	}
    }
    
    
    
/*    @FXML
    void start(Stage window) throws Exception     { 
       
    } */
   /* 
    public void creervueMap(int[][] tab) {

    	for (int i = 0; i < tab.length; i++) {
    		for (int j = 0; j < tab[].length; j++) {
    			terrain.getChildren().add(tab[i][j]);
    		}
    	}
    }
    
	public String imageDe(int i) {
		
		if (i == 210) { 
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
		else if (i == 26) {
			img = "";
		}
		else if (i == 27) {
			img = "";
		}
		else if (i == 28) {
			img = "";
		}
		else if (i == 29) {
			img = "";
		}
		else if (i == 30) {
			img = "";
		}
		else if (i == 49) {
			img = "";
		}
		else if (i == 225) { 
			img = "";
		}
		else if (i == 53) {
			img = "";
		}
		else if (i == 50) {
			img = "";
		}
		else if (i == 51) {
			img = "";
		}
		else if (i == 52) {
			img = "";
		}
		else if (i == 54) {
			img = "";
		}
		else if (i == 73) {
			img = "";
		}
		else if (i == 74) {
			img = "";
		}
		else if (i == 75) {
			img = "";
		}
		else if (i == 76) {
			img = "";
		}
		else if (i == 77) {
			img = "";
		}
		else if (i == 78) {
			img = "";
		} 		
		else if (i == 97) {
			img = "";
		}
		else if (i == 98) {
			img = "";
		}
		else if (i == 99) {
			img = "";
		}
		else if (i == 100) {
			img = "";
		}
		else if (i == 101) {
			img = "";
		}
		else if (i == 102) {
			img = "";
		}
		else if (i == 265) {
			img = "";
		}
		else if (i == 266) {
			img = "";
		} 
		else if (i == 267) {
			img = "";
		}
		else if (i == 268) {
			img = "";
		}
		else if (i == 32) {
			img = "";
		}
		else if (i == 33) {
			img = "";
		}
		else if (i == 34) {
			img = "";
		} 		
		else if (i == 35) {
			img = "";
		}
		else if (i == 56) {
			img = "";
		}
		else if (i == 57) {
			img = "";
		}
		else if (i == 58) {
			img = "";
		}
		else if (i == 59) {
			img = "";
		}
		else if (i == 80) {
			img = "";
		}
		else if (i == 81) {
			img = "";
		}
		else if (i == 82) {
			img = "";
		}
		else if (i == 83) {
			img = "";
		}
		else if (i == 104) {
			img = "";
		}
		else if (i == 105) {
			img = "";
		}
		else if (i == 106) {
			img = "";
		}
		else if (i == 107) {
			img = "";
		}
		return img;
	} //getViewPort
	
    	
    	*/
    	
    	
    	
    	
    	
    	
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
	
}
