package projetZelda.modele;

public class Jeu {
	
	private Link hero;
	protected int[][] terrain = new int[20][20];
	
	public Jeu() {
		
	}
	
	public Link getLink() {
		return this.hero;
	}
	
	public int[][] getTerrain() {
		return this.terrain;
	}
	
	public int[][] initTerrain() {
		this.terrain[0][0] = 210;
		this.terrain[0][1] = 210;
		
		this.terrain[0][2] = 210;
		this.terrain[0][3] = 210;
		this.terrain[0][4] = 210;
		this.terrain[0][5] = 210;
		this.terrain[0][6] = 210;
		this.terrain[0][7] = 210;
		this.terrain[0][8] = 210;
		this.terrain[0][9] = 210;
		this.terrain[0][10] = 210;
		this.terrain[0][11] = 210;
		this.terrain[0][12] = 210;
		this.terrain[0][13] = 210;
		this.terrain[0][14] = 210;
		this.terrain[0][15] = 210;
		this.terrain[0][16] = 210;
		this.terrain[0][17] = 210;
		this.terrain[0][18] = 210;
		this.terrain[0][19] = 210;
		this.terrain[1][0] = 210;
		this.terrain[1][1] = 210;
		this.terrain[1][2] = 210;
		this.terrain[1][3] = 210;
		this.terrain[1][4] = 210;
		this.terrain[1][5] = 210;
		this.terrain[1][6] = 210;
		this.terrain[1][7] = 210;
		this.terrain[1][8] = 210;
		this.terrain[1][9] = 210;
		this.terrain[1][10] = 210;
		this.terrain[1][11] = 210;
		this.terrain[1][12] = 210;
		this.terrain[1][13] = 210;
		this.terrain[1][14] = 210;
		this.terrain[1][15] = 210;
		this.terrain[1][16] = 210;
		this.terrain[1][17] = 210;
		this.terrain[1][18] = 210;
		this.terrain[1][19] = 210;
		this.terrain[2][0] = 210;
		this.terrain[2][1] = 210;
		this.terrain[2][2] = 1;
		this.terrain[2][3] = 2;
		this.terrain[2][4] = 3;
		this.terrain[2][5] = 4;
		this.terrain[2][6] = 5;
		this.terrain[2][7] = 6;
		this.terrain[2][8] = 210;
		this.terrain[2][9] = 210;
		this.terrain[2][10] = 210;
		this.terrain[2][11] = 210;
		this.terrain[2][12] = 210;
		this.terrain[2][13] = 210;
		this.terrain[2][14] = 210;
		this.terrain[2][15] = 210;
		this.terrain[2][16] = 210;
		this.terrain[2][17] = 210;
		this.terrain[2][18] = 210;
		this.terrain[2][19] = 210;
		this.terrain[3][0] = 210;
		this.terrain[3][1] = 210;
		this.terrain[3][2] = 25;
		this.terrain[3][3] = 26;
		this.terrain[3][4] = 27;
		this.terrain[3][5] = 28;
		this.terrain[3][6] = 29;
		this.terrain[3][7] = 30;
		this.terrain[3][8] = 210;
		this.terrain[3][9] = 210;
		this.terrain[3][10] = 210;
		this.terrain[3][11] = 210;
		this.terrain[3][12] = 210;
		this.terrain[3][13] = 210;
		this.terrain[3][14] = 210;
		this.terrain[3][15] = 210;
		this.terrain[3][16] = 210;
		this.terrain[3][17] = 210;
		this.terrain[3][18] = 210;
		this.terrain[3][19] = 210;
		this.terrain[4][0] = 210;
		this.terrain[4][1] = 210;
		this.terrain[4][2] = 49;
		this.terrain[4][3] = 50;
		this.terrain[4][4] = 51;
		this.terrain[4][5] = 52;
		this.terrain[4][6] = 53;
		this.terrain[4][7] = 54;
		this.terrain[4][8] = 210;
		this.terrain[4][9] = 210;
		this.terrain[4][10] = 210;
		this.terrain[4][11] = 210;
		this.terrain[4][12] = 210;
		this.terrain[4][13] = 210;
		this.terrain[4][14] = 210;
		this.terrain[4][15] = 210;
		this.terrain[4][16] = 210;
		this.terrain[4][17] = 210;
		this.terrain[4][18] = 210;
		this.terrain[4][19] = 210;
		this.terrain[5][0] = 210;
		this.terrain[5][1] = 210;
		this.terrain[5][2] = 73;
		this.terrain[5][3] = 74;
		this.terrain[5][4] = 75;
		this.terrain[5][5] = 76;
		this.terrain[5][6] = 77;
		this.terrain[5][7] = 78;
		this.terrain[5][8] = 210;
		this.terrain[5][9] = 210;
		this.terrain[5][10] = 265;
		this.terrain[5][11] = 266;
		this.terrain[5][12] = 267;
		this.terrain[5][13] = 268;
		this.terrain[5][14] = 265;
		this.terrain[5][15] = 266;
		this.terrain[5][16] = 267;
		this.terrain[5][17] = 268;
		this.terrain[5][18] = 210;
		this.terrain[5][19] = 210;
		this.terrain[6][0] = 210;
		this.terrain[6][1] = 210;
		this.terrain[6][2] = 97;
		this.terrain[6][3] = 98;
		this.terrain[6][4] = 99;
		this.terrain[6][5] = 100;
		this.terrain[6][6] = 101;
		this.terrain[6][7] = 102;
		this.terrain[6][8] = 210;
		this.terrain[6][9] = 210;
		this.terrain[6][10] = 210;
		this.terrain[6][11] = 210;
		this.terrain[6][12] = 210;
		this.terrain[6][13] = 210;
		this.terrain[6][14] = 210;
		this.terrain[6][15] = 210;
		this.terrain[6][16] = 210;
		this.terrain[6][17] = 210;
		this.terrain[6][18] = 210;
		this.terrain[6][19] = 210;
		this.terrain[7][0] = 210;
		this.terrain[7][1] = 210;
		this.terrain[7][2] = 210;
		this.terrain[7][3] = 210;
		this.terrain[7][4] = 210;
		this.terrain[7][5] = 210;
		this.terrain[7][6] = 210;
		this.terrain[7][7] = 210;
		this.terrain[7][8] = 210;
		this.terrain[7][9] = 210;
		this.terrain[7][10] = 265;
		this.terrain[7][11] = 266;
		this.terrain[7][12] = 267;
		this.terrain[7][13] = 268;
		this.terrain[7][14] = 265;
		this.terrain[7][15] = 266;
		this.terrain[7][16] = 267;
		this.terrain[7][17] = 268;
		this.terrain[7][18] = 210;
		this.terrain[7][19] = 210;
		this.terrain[8][0] = 210;
		this.terrain[8][1] = 210;
		this.terrain[8][2] = 210;
		this.terrain[8][3] = 210;
		this.terrain[8][4] = 210;
		this.terrain[8][5] = 210;
		this.terrain[8][6] = 210;
		this.terrain[8][7] = 210;
		this.terrain[8][8] = 210;
		this.terrain[8][9] = 210;
		this.terrain[8][10] = 210;
		this.terrain[8][11] = 210;
		this.terrain[8][12] = 210;
		this.terrain[8][13] = 210;
		this.terrain[8][14] = 210;
		this.terrain[8][15] = 210;
		this.terrain[8][16] = 210;
		this.terrain[8][17] = 210;
		this.terrain[8][18] = 210;
		this.terrain[8][19] = 210;
		this.terrain[9][0] = 210;
		this.terrain[9][1] = 210;
		this.terrain[9][2] = 210;
		this.terrain[9][3] = 210;
		this.terrain[9][4] = 210;
		this.terrain[9][5] = 210;
		this.terrain[9][6] = 210;
		this.terrain[9][7] = 210;
		this.terrain[9][8] = 210;
		this.terrain[9][9] = 210;
		this.terrain[9][10] = 210;
		this.terrain[9][11] = 210;
		this.terrain[9][12] = 210;
		this.terrain[9][13] = 210;
		this.terrain[9][14] = 210;
		this.terrain[9][15] = 210;
		this.terrain[9][16] = 210;
		this.terrain[9][17] = 210;
		this.terrain[9][18] = 210;
		this.terrain[9][19] = 210;
		this.terrain[10][0] = 210;
		this.terrain[10][1] = 210;
		this.terrain[10][2] = 210;
		this.terrain[10][3] = 210;
		this.terrain[10][4] = 210;
		this.terrain[10][5] = 210;
		this.terrain[10][6] = 210;
		this.terrain[10][7] = 210;
		this.terrain[10][8] = 210;
		this.terrain[10][9] = 210;
		this.terrain[10][10] = 210;
		this.terrain[10][11] = 210;
		this.terrain[10][12] = 210;
		this.terrain[10][13] = 210;
		this.terrain[10][14] = 210;
		this.terrain[10][15] = 210;
		this.terrain[10][16] = 210;
		this.terrain[10][17] = 210;
		this.terrain[10][18] = 210;
		this.terrain[10][19] = 210;
		this.terrain[11][0] = 210;
		this.terrain[11][1] = 210;
		this.terrain[11][2] = 210;
		this.terrain[11][3] = 210;
		this.terrain[11][4] = 210;
		this.terrain[11][5] = 210;
		this.terrain[11][6] = 210;
		this.terrain[11][7] = 210;
		this.terrain[11][8] = 210;
		this.terrain[11][9] = 210;
		this.terrain[11][10] = 210;
		this.terrain[11][11] = 210;
		this.terrain[11][12] = 210;
		this.terrain[11][13] = 210;
		this.terrain[11][14] = 210;
		this.terrain[11][15] = 210;
		this.terrain[11][16] = 210;
		this.terrain[11][17] = 210;
		this.terrain[11][18] = 210;
		this.terrain[11][19] = 210;
		this.terrain[12][0] = 210;
		this.terrain[12][1] = 210;
		this.terrain[12][2] = 210;
		this.terrain[12][3] = 210;
		this.terrain[12][4] = 210;
		this.terrain[12][5] = 210;
		this.terrain[12][6] = 210;
		this.terrain[12][7] = 210;
		this.terrain[12][8] = 210;
		this.terrain[12][9] = 210;
		this.terrain[12][10] = 210;
		this.terrain[12][11] = 210;
		this.terrain[12][12] = 210;
		this.terrain[12][13] = 210;
		this.terrain[12][14] = 210;
		this.terrain[12][15] = 210;
		this.terrain[12][16] = 210;
		this.terrain[12][17] = 210;
		this.terrain[12][18] = 210;
		this.terrain[12][19] = 210;
		this.terrain[13][0] = 210;
		this.terrain[13][1] = 210;
		this.terrain[13][2] = 210;
		this.terrain[13][3] = 210;
		this.terrain[13][4] = 210;
		this.terrain[13][5] = 210;
		this.terrain[13][6] = 210;
		this.terrain[13][7] = 210;
		this.terrain[13][8] = 210;
		this.terrain[13][9] = 210;
		this.terrain[13][10] = 210;
		this.terrain[13][11] = 210;
		this.terrain[13][12] = 210;
		this.terrain[13][13] = 32;
		this.terrain[13][14] = 33;
		this.terrain[13][15] = 34;
		this.terrain[13][16] = 35;
		this.terrain[13][17] = 210;
		this.terrain[13][18] = 210;
		this.terrain[13][19] = 210;
		this.terrain[14][0] = 210;
		this.terrain[14][1] = 210;
		this.terrain[14][2] = 210;
		this.terrain[14][3] = 210;
		this.terrain[14][4] = 210;
		this.terrain[14][5] = 210;
		this.terrain[14][6] = 210;
		this.terrain[14][7] = 210;
		this.terrain[14][8] = 210;
		this.terrain[14][9] = 210;
		this.terrain[14][10] = 210;
		this.terrain[14][11] = 210;
		this.terrain[14][12] = 210;
		this.terrain[14][13] = 56;
		this.terrain[14][14] = 57;
		this.terrain[14][15] = 58;
		this.terrain[14][16] = 59;
		this.terrain[14][17] = 210;
		this.terrain[14][18] = 210;
		this.terrain[14][19] = 210;
		this.terrain[15][0] = 210;
		this.terrain[15][1] = 210;
		this.terrain[15][2] = 210;
		this.terrain[15][3] = 210;
		this.terrain[15][4] = 210;
		this.terrain[15][5] = 210;
		this.terrain[15][6] = 210;
		this.terrain[15][7] = 210;
		this.terrain[15][8] = 210;
		this.terrain[15][9] = 210;
		this.terrain[15][10] = 210;
		this.terrain[15][11] = 210;
		this.terrain[15][12] = 210;
		this.terrain[15][13] = 80;
		this.terrain[15][14] = 81;
		this.terrain[15][15] = 82;
		this.terrain[15][16] = 83;
		this.terrain[15][17] = 210;
		this.terrain[15][18] = 210;
		this.terrain[15][19] = 210;
		this.terrain[16][0] = 210;
		this.terrain[16][1] = 210;
		this.terrain[16][2] = 210;
		this.terrain[16][3] = 210;
		this.terrain[16][4] = 210;
		this.terrain[16][5] = 210;
		this.terrain[16][6] = 210;
		this.terrain[16][7] = 210;
		this.terrain[16][8] = 210;
		this.terrain[16][9] = 210;
		this.terrain[16][10] = 210;
		this.terrain[16][11] = 210;
		this.terrain[16][12] = 210;
		this.terrain[16][13] = 104;
		this.terrain[16][14] = 105;
		this.terrain[16][15] = 106;
		this.terrain[16][16] = 107;
		this.terrain[16][17] = 210;
		this.terrain[16][18] = 210;
		this.terrain[16][19] = 210;
		this.terrain[17][0] = 210;
		this.terrain[17][1] = 210;
		this.terrain[17][2] = 210;
		this.terrain[17][3] = 210;
		this.terrain[17][4] = 210;
		this.terrain[17][5] = 210;
		this.terrain[17][6] = 210;
		this.terrain[17][7] = 210;
		this.terrain[17][8] = 210;
		this.terrain[17][9] = 210;
		this.terrain[17][10] = 210;
		this.terrain[17][11] = 210;
		this.terrain[17][12] = 210;
		this.terrain[17][13] = 210;
		this.terrain[17][14] = 210;
		this.terrain[17][15] = 210;
		this.terrain[17][16] = 210;
		this.terrain[17][17] = 210;
		this.terrain[17][18] = 210;
		this.terrain[17][19] = 210;
		this.terrain[18][0] = 210;
		this.terrain[18][1] = 210;
		this.terrain[18][2] = 210;
		this.terrain[18][3] = 210;
		this.terrain[18][4] = 210;
		this.terrain[18][5] = 210;
		this.terrain[18][6] = 210;
		this.terrain[18][7] = 210;
		this.terrain[18][8] = 210;
		this.terrain[18][9] = 210;
		this.terrain[18][10] = 210;
		this.terrain[18][11] = 210;
		this.terrain[18][12] = 210;
		this.terrain[18][13] = 210;
		this.terrain[18][14] = 210;
		this.terrain[18][15] = 210;
		this.terrain[18][16] = 210;
		this.terrain[18][17] = 210;
		this.terrain[18][18] = 210;
		this.terrain[18][19] = 210;
		this.terrain[19][0] = 210;
		this.terrain[19][1] = 210;
		this.terrain[19][2] = 210;
		this.terrain[19][3] = 210;
		this.terrain[19][4] = 210;
		this.terrain[19][5] = 210;
		this.terrain[19][6] = 210;
		this.terrain[19][7] = 210;
		this.terrain[19][8] = 210;
		this.terrain[19][9] = 210;
		this.terrain[19][10] = 210;
		this.terrain[19][11] = 210;
		this.terrain[19][12] = 210;
		this.terrain[19][13] = 210;
		this.terrain[19][14] = 210;
		this.terrain[19][15] = 210;
		this.terrain[19][16] = 210;
		this.terrain[19][17] = 210;
		this.terrain[19][18] = 210;
		this.terrain[19][19] = 210;
		return terrain;
	}
	
	public String imageDe(int i) {
		String img = "tiles_12.tsx";
		if (i == 210) { // 210, 1, 2, 3, 4, 5, 6, 25, 26, 27, 28, 29, 30, 49, 50, 51, 52, 53, 54, 73, 74, 75, 76, 77, 78, 
			   // 97, 98, 99, 100, 101, 102, 265, 266, 267, 268, 32, 33, 34, 35, 56, 57, 58, 59, 80, 81, 82, 83,
				// 104, 105, 106, 107
			img = "";
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
	
	public String afficherTab(int[][] tab) {
		String txt = "";
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				txt += tab[i][j] + "\t";
			}
			txt += "\n";
		}
		return txt;
	}
	
	public String toString(int[][] tab) {
		String txt = "";
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				txt += imageDe(tab[i][j]);
			}
			txt += "\n";
		}
		return txt;
	}
	
	
}
