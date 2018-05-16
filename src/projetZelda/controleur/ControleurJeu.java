package projetZelda.controleur;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import projetZelda.modele.Jeu;
import projetZelda.modele.Link;

public class ControleurJeu implements Initializable {
	
	Stage window;
	public Jeu nouveauJeu;
	public Link hero;
	private int[][] tab;
	private String tileSet = "src/projetZelda/vue/tiles_12.tsx";
	
	//  partie pour les touches	
    public boolean toucheUp = false;
    public boolean toucheDown = false;
    public boolean toucheRight = false;
    public boolean toucheLeft = false;
	
	//	private final static Image image2 = new Image("Projet1/src/projet1/vue/tiles_12.png");
	@FXML private Pane console;
	@FXML private TilePane terrain;
	@FXML private TilePane terrain1;
	@FXML private ImageView consoleLink;
//	@FXML private ImageView imgView;
    
	private final static int MROW = 20;
	private final static int MCOLUMN = 20;
	private ImageView[][] tileMapImage;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			nouveauJeu = new Jeu();
			hero = nouveauJeu.getLink();
			
			terrain.setPrefRows(MROW);
	        terrain.setPrefColumns(MCOLUMN);
			terrain1.setPrefRows(MROW);
	        terrain1.setPrefColumns(MCOLUMN);
	        
	        tab = nouveauJeu.initTerrain();
	//      nouveauJeu.toString(tab);		
	        
	        initMap();
	        initLink();
	    	    	
	    	
	}
	    	
	
    public void initMap() {
    	BufferedImage link; //11 x 7
    	BufferedImage non;
    	BufferedImage maison1;
    	BufferedImage maison2;
    	BufferedImage maison3;
    	BufferedImage maison4;
    	BufferedImage maison5;
    	BufferedImage maison6;
    	BufferedImage maison7;
    	BufferedImage maison8;
    	BufferedImage maison9;
    	BufferedImage maison10;
    	BufferedImage maison11;
    	BufferedImage maison12;
    	BufferedImage maison13;
    	BufferedImage maison14;
    	BufferedImage maison15;
    	BufferedImage maison16;
    	BufferedImage maison17;
    	BufferedImage maison18;
    	BufferedImage maison19;
    	BufferedImage maison20;
    	BufferedImage maison21;
    	BufferedImage maison22;
    	BufferedImage maison23;
    	BufferedImage maison24;
    	BufferedImage maison25;
    	BufferedImage maison26;
    	BufferedImage maison27;
    	BufferedImage maison28;
    	BufferedImage maison29;
    	BufferedImage maison30;
    	BufferedImage herbe;
    	BufferedImage fleur1;
    	BufferedImage fleur2;
    	BufferedImage fleur3;
    	BufferedImage fleur4;
    	BufferedImage maisonB1;
    	BufferedImage maisonB2;
    	BufferedImage maisonB3;
    	BufferedImage maisonB4;
    	BufferedImage maisonB5;
    	BufferedImage maisonB6;
    	BufferedImage maisonB7;
    	BufferedImage maisonB8;
    	BufferedImage maisonB9;
    	BufferedImage maisonB10;
    	BufferedImage maisonB11;
    	BufferedImage maisonB12;
    	BufferedImage maisonB13;
    	BufferedImage maisonB14;
    	BufferedImage maisonB15;
    	BufferedImage maisonB16;
    	
    	BufferedImage objet;
	    	
		try {
			objet = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(176,176,16,16);
			
			link = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(176,112,16,32);
			herbe = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(288,144,16,16);
			non = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(112,16,16,16); 
			maison1 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(16,16,16,16); 
			maison2 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(32,16,16,16); 
			maison3 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(48,16,16,16); 
			maison4 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(64,16,16,16); 
			maison5 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(80,16,16,16); 
			maison6 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(96,16,16,16); 
			maison7 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(16,32,16,16); 
			maison8 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(32,32,16,16); 
			maison9 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(48,32,16,16); 
			maison10 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(64,32,16,16); 
			maison11 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(80,32,16,16); 
			maison12 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(96,32,16,16);
			maison13 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(16,48,16,16); 
			maison14 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(32,48,16,16); 
			maison15 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(48,48,16,16); 
			maison16 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(64,48,16,16); 
			maison17 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(80,48,16,16); 
			maison18 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(96,48,16,16);
			maison19 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(16,64,16,16); 
			maison20 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(32,64,16,16); 
			maison21 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(48,64,16,16); 
			maison22 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(64,64,16,16); 
			maison23 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(80,64,16,16); 
			maison24 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(96,64,16,16);
			maison25 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(16,80,16,16); 
			maison26 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(32,80,16,16); 
			maison27 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(48,80,16,16); 
			maison28 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(64,80,16,16); 
			maison29 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(80,80,16,16); 
			maison30 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(96,80,16,16);
			fleur1 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(16,192,16,16); 
			fleur2 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(32,192,16,16); 
			fleur3 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(48,192,16,16); 
			fleur4 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(64,192,16,16);
			maisonB1 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(128,32,16,16); 
			maisonB2 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(144,32,16,16); 
			maisonB3 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(160,32,16,16); 
			maisonB4 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(176,32,16,16); 
			maisonB5 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(128,48,16,16); 
			maisonB6 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(144,48,16,16); 
			maisonB7 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(160,48,16,16); 
			maisonB8 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(176,48,16,16); 
			maisonB9 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(128,64,16,16); 
			maisonB10 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(144,64,16,16); 
			maisonB11 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(160,64,16,16); 
			maisonB12 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(176,64,16,16);
			maisonB13 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(128,80,16,16); 
			maisonB14 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(144,80,16,16); 
			maisonB15 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(160,80,16,16); 
			maisonB16 = ImageIO.read(new File("src/projetZelda/vue/tiles_12.png").toURI().toURL()).getSubimage(176,80,16,16); 
	
			ImageView imgL = new ImageView();
			imgL.setImage(SwingFXUtils.toFXImage(link,null));
			//consoleLink.getChildren().add(imgL);
			
			for (int i = 0; i < MROW; i++) {
				for (int j = 0; j < MCOLUMN; j++) {
					ImageView img0 = new ImageView();
					img0.setImage(SwingFXUtils.toFXImage(herbe,null));
					terrain1.getChildren().add(img0);
					switch (tab[i][j]) { 
						case 210: 
							ImageView img1 = new ImageView();
							img1.setImage(SwingFXUtils.toFXImage(non,null));
							terrain.getChildren().add(img1);
							break;
						case 211:
							ImageView imgOb = new ImageView();
							imgOb.setImage(SwingFXUtils.toFXImage(objet,null));
							terrain.getChildren().add(imgOb);
							break;	
						case 1: 
							ImageView img2 = new ImageView();
							img2.setImage(SwingFXUtils.toFXImage(maison1,null));
							terrain.getChildren().add(img2);
							break;
						case 2: 
							ImageView img3 = new ImageView();
							img3.setImage(SwingFXUtils.toFXImage(maison2,null));
							terrain.getChildren().add(img3);
							break;
						case 3: 
							ImageView img4 = new ImageView();
							img4.setImage(SwingFXUtils.toFXImage(maison3,null));
							terrain.getChildren().add(img4);
							break;
						case 4: 
							ImageView img5 = new ImageView();
							img5.setImage(SwingFXUtils.toFXImage(maison4,null));
							terrain.getChildren().add(img5);
							break;
						case 5: 
							ImageView img6 = new ImageView();
							img6.setImage(SwingFXUtils.toFXImage(maison5,null));
							terrain.getChildren().add(img6);
							break;
						case 6: 
							ImageView img7 = new ImageView();
							img7.setImage(SwingFXUtils.toFXImage(maison6,null));
							terrain.getChildren().add(img7);
							break;
						case 25: 
							ImageView img8 = new ImageView();
							img8.setImage(SwingFXUtils.toFXImage(maison7,null));
							terrain.getChildren().add(img8);
							break;
						case 26: 
							ImageView img9 = new ImageView();
							img9.setImage(SwingFXUtils.toFXImage(maison8,null));
							terrain.getChildren().add(img9);
							break;
						case 27: 
							ImageView img10 = new ImageView();
							img10.setImage(SwingFXUtils.toFXImage(maison9,null));
							terrain.getChildren().add(img10);
							break;
						case 28: 
							ImageView img11 = new ImageView();
							img11.setImage(SwingFXUtils.toFXImage(maison10,null));
							terrain.getChildren().add(img11);
							break;
						case 29: 
							ImageView img12 = new ImageView();
							img12.setImage(SwingFXUtils.toFXImage(maison11,null));
							terrain.getChildren().add(img12);
							break;
						case 30: 
							ImageView img13 = new ImageView();
							img13.setImage(SwingFXUtils.toFXImage(maison12,null));
							terrain.getChildren().add(img13);
							break;
						case 49: 
							ImageView img14 = new ImageView();
							img14.setImage(SwingFXUtils.toFXImage(maison13,null));
							terrain.getChildren().add(img14);
							break;
						case 50: 
							ImageView img15 = new ImageView();
							img15.setImage(SwingFXUtils.toFXImage(maison14,null));
							terrain.getChildren().add(img15);
							break;
						case 51: 
							ImageView img16 = new ImageView();
							img16.setImage(SwingFXUtils.toFXImage(maison15,null));
							terrain.getChildren().add(img16);
							break;
						case 52: 
							ImageView img17 = new ImageView();
							img17.setImage(SwingFXUtils.toFXImage(maison16,null));
							terrain.getChildren().add(img17);
							break;
						case 53: 
							ImageView img18 = new ImageView();
							img18.setImage(SwingFXUtils.toFXImage(maison17,null));
							terrain.getChildren().add(img18);
							break;
						case 54: 
							ImageView img19 = new ImageView();
							img19.setImage(SwingFXUtils.toFXImage(maison18,null));
							terrain.getChildren().add(img19);
							break;
						case 73: 
							ImageView img20 = new ImageView();
							img20.setImage(SwingFXUtils.toFXImage(maison19,null));
							terrain.getChildren().add(img20);
							break;
						case 74: 
							ImageView img21 = new ImageView();
							img21.setImage(SwingFXUtils.toFXImage(maison20,null));
							terrain.getChildren().add(img21);
							break;
						case 75: 
							ImageView img22 = new ImageView();
							img22.setImage(SwingFXUtils.toFXImage(maison21,null));
							terrain.getChildren().add(img22);
							break;
						case 76: 
							ImageView img23 = new ImageView();
							img23.setImage(SwingFXUtils.toFXImage(maison22,null));
							terrain.getChildren().add(img23);
							break;
						case 77: 
							ImageView img24 = new ImageView();
							img24.setImage(SwingFXUtils.toFXImage(maison23,null));
							terrain.getChildren().add(img24);
							break;
						case 78: 
							ImageView img25 = new ImageView();
							img25.setImage(SwingFXUtils.toFXImage(maison24,null));
							terrain.getChildren().add(img25);
							break;
						case 97: 
							ImageView img26 = new ImageView();
							img26.setImage(SwingFXUtils.toFXImage(maison25,null));
							terrain.getChildren().add(img26);
							break;
						case 98: 
							ImageView img27 = new ImageView();
							img27.setImage(SwingFXUtils.toFXImage(maison26,null));
							terrain.getChildren().add(img27);
							break;
						case 99: 
							ImageView img28 = new ImageView();
							img28.setImage(SwingFXUtils.toFXImage(maison27,null));
							terrain.getChildren().add(img28);
							break;
						case 100: 
							ImageView img29 = new ImageView();
							img29.setImage(SwingFXUtils.toFXImage(maison28,null));
							terrain.getChildren().add(img29);
							break;
						case 101: 
							ImageView img30 = new ImageView();
							img30.setImage(SwingFXUtils.toFXImage(maison29,null));
							terrain.getChildren().add(img30);
							break;
						case 102: 
							ImageView img31 = new ImageView();
							img31.setImage(SwingFXUtils.toFXImage(maison30,null));
							terrain.getChildren().add(img31);
							break;
						case 265: 
							ImageView img32 = new ImageView();
							img32.setImage(SwingFXUtils.toFXImage(fleur1,null));
							terrain.getChildren().add(img32);
							break;
						case 266: 
							ImageView img33 = new ImageView();
							img33.setImage(SwingFXUtils.toFXImage(fleur2,null));
							terrain.getChildren().add(img33);
							break;
						case 267: 
							ImageView img34 = new ImageView();
							img34.setImage(SwingFXUtils.toFXImage(fleur3,null));
							terrain.getChildren().add(img34);
							break;
						case 268: 
							ImageView img35 = new ImageView();
							img35.setImage(SwingFXUtils.toFXImage(fleur4,null));
							terrain.getChildren().add(img35);
							break;
						case 32: 
							ImageView img36 = new ImageView();
							img36.setImage(SwingFXUtils.toFXImage(maisonB1,null));
							terrain.getChildren().add(img36);
							break;
						case 33: 
							ImageView img37 = new ImageView();
							img37.setImage(SwingFXUtils.toFXImage(maisonB2,null));
							terrain.getChildren().add(img37);
							break;
						case 34: 
							ImageView img38 = new ImageView();
							img38.setImage(SwingFXUtils.toFXImage(maisonB3,null));
							terrain.getChildren().add(img38);
							break;
						case 35: 
							ImageView img39 = new ImageView();
							img39.setImage(SwingFXUtils.toFXImage(maisonB4,null));
							terrain.getChildren().add(img39);
							break;
						case 56: 
							ImageView img40 = new ImageView();
							img40.setImage(SwingFXUtils.toFXImage(maisonB5,null));
							terrain.getChildren().add(img40);
							break;
						case 57: 
							ImageView img41 = new ImageView();
							img41.setImage(SwingFXUtils.toFXImage(maisonB6,null));
							terrain.getChildren().add(img41);
							break;
						case 58: 
							ImageView img42 = new ImageView();
							img42.setImage(SwingFXUtils.toFXImage(maisonB7,null));
							terrain.getChildren().add(img42);
							break;
						case 59: 
							ImageView img43 = new ImageView();
							img43.setImage(SwingFXUtils.toFXImage(maisonB8,null));
							terrain.getChildren().add(img43);
							break;
						case 80: 
							ImageView img44 = new ImageView();
							img44.setImage(SwingFXUtils.toFXImage(maisonB9,null));
							terrain.getChildren().add(img44);
							break;
						case 81: 
							ImageView img45 = new ImageView();
							img45.setImage(SwingFXUtils.toFXImage(maisonB10,null));
							terrain.getChildren().add(img45);
							break;
						case 82: 
							ImageView img46 = new ImageView();
							img46.setImage(SwingFXUtils.toFXImage(maisonB11,null));
							terrain.getChildren().add(img46);
							break;
						case 83: 
							ImageView img47 = new ImageView();
							img47.setImage(SwingFXUtils.toFXImage(maisonB12,null));
							terrain.getChildren().add(img47);
							break;
						case 104: 
							ImageView img48 = new ImageView();
							img48.setImage(SwingFXUtils.toFXImage(maisonB13,null));
							terrain.getChildren().add(img48);
							break;
						case 105: 
							ImageView img49 = new ImageView();
							img49.setImage(SwingFXUtils.toFXImage(maisonB14,null));
							terrain.getChildren().add(img49);
							break;
						case 106: 
							ImageView img50 = new ImageView();
							img50.setImage(SwingFXUtils.toFXImage(maisonB15,null));
							terrain.getChildren().add(img50);
							break;
						case 107: 
							ImageView img51 = new ImageView();
							img51.setImage(SwingFXUtils.toFXImage(maisonB16,null));
							terrain.getChildren().add(img51);
							break;	
						default: break;
					}	
	
				}
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	    }
	
    }
  /*  
    @FXML
    void deplacerDroite(ActionEvent event) {
    	if (!nouveauJeu.mur(this.hero.getX() + this.hero.getVitesse(), this.hero.getY())) {
    		this.hero.deplacerDroite();
    	}
    }
    
    @FXML
    void deplacerGauche(ActionEvent event) {
    	if (!nouveauJeu.mur(this.hero.getX() - this.hero.getVitesse(), this.hero.getY())) {
    		this.hero.deplacerGauche();
    	}
    }
    
    @FXML
    void deplacerHaut(ActionEvent event) {
    	if (!nouveauJeu.mur(this.hero.getX(), this.hero.getY() - this.hero.getVitesse())) {
    		this.hero.deplacerHaut();
    	}
    }
    
    @FXML
    void deplacerBas(ActionEvent event) {
    	if (!nouveauJeu.mur(this.hero.getX(), this.hero.getY() + this.hero.getVitesse())) {
    		this.hero.deplacerBas();
    	}
    }*/
    
    public void initLink() {
    	
    	File image=new File("src/projetZelda/vue/link.png");
        Image linkPicture = new Image(image.toURI().toString(),16,32,false,false);
    	//Image linkPicture = new Image("/projetZelda/vue/link.png");
    	consoleLink.setImage(linkPicture);
    	consoleLink.setLayoutX(160);
    	consoleLink.setLayoutY(160);
    }
    
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getCode() == KeyCode.UP) {
            toucheUp = true;
        }
        if(e.getCode() == KeyCode.DOWN){
            toucheDown = true;
        }
        if(e.getCode() == KeyCode.RIGHT){
            toucheRight = true;
        }
        if(e.getCode() == KeyCode.LEFT){
            toucheLeft = true;
        }
    }
    
    public void Move(){
        while(true){
            if(toucheUp == true && !nouveauJeu.mur(this.hero.getX(), this.hero.getY() - this.hero.getVitesse())){
                this.hero.deplacerHaut();
            }
            if(toucheDown == true && !nouveauJeu.mur(this.hero.getX(), this.hero.getY() + this.hero.getVitesse())){
                this.hero.deplacerBas();
            }
            if(toucheLeft == true && !nouveauJeu.mur(this.hero.getX() - this.hero.getVitesse(), this.hero.getY())){
                this.hero.deplacerGauche();
            }
            if(toucheRight == true && !nouveauJeu.mur(this.hero.getX() + this.hero.getVitesse(), this.hero.getY())){
                this.hero.deplacerDroite();
            }
             try {
                    Thread.sleep(25);
                  } catch (InterruptedException e) {
                    e.printStackTrace();
                  }
        }
    }
    
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
     
        if(e.getCode() == KeyCode.UP){
            toucheUp = false;
        }
        if(e.getCode() == KeyCode.DOWN){
            toucheDown = false;
        }
        if(e.getCode() == KeyCode.RIGHT){
            toucheRight = false;
        }
        if(e.getCode() == KeyCode.LEFT){
            toucheLeft = false;
        }     
    }
    
    public int getNewX(){
    	return this.hero.getX();
    }
    
    public int getNewY(){
    	return this.hero.getY();
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
	
}
