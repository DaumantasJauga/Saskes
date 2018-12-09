package saskes;

import java.util.Arrays;

public class Map {
	/*0- nenaudojami laukai
	 *1-naudojami laukai
	 *2-vieno zaidejo saskes
	 *5-kito zaidejo saskes
	 */
	 private int map [][] = new int [][] {  
		
		{0,2,0,2,0,2,0,2}, 
		{2,0,2,0,2,0,2,0}, 
		{0,2,0,2,0,2,0,2}, 
		{1,0,1,0,1,0,1,0},
		{0,1,0,1,0,1,0,1},
		{5,0,5,0,5,0,5,0}, 
		{0,5,0,5,0,5,0,5},  
		{5,0,5,0,5,0,5,0}, 
		 
	 	};  
	 	
	 	
	 	
	 	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}
	
 	public int getMapValues(int x1, int y1) {
 		return map[x1][y1];
}

public void setMapValues(int x1, int y1, int value) {
	this.map[x1][x1] = value;
}

		public boolean isOutOfBorder(int x, int y) {
			if(x>this.getWidth() || y>this.getHeight())
				{
				return false;
				}
				else {
					return true;
					}
		}
		
		public int getHeight() {
			return map.length;
		}
		
		public int getWidth() {
			return map[0].length;
		}
		
		public void changeMap(int x1, int y1, int x2, int y2, int value) {
			this.map[y1][x1]=1;
			this.map[y2][x2]=value;			
		}
		
		public boolean doesCheckersExist() {
			if (Arrays.asList(map).contains(2) && Arrays.asList(map).contains(5)) {
				return true;				
			}
			else {
				return false;
			}			
		}	
}
