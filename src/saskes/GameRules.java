package saskes;

public class GameRules {
	
	private Map map;
	boolean turn;
	
	public GameRules(Map map) {
	this.map = map;
	}
	
	public void isGameOver() {
		if(!map.doesCheckersExist()) {
			System.out.println("Game Over!!!!");
			System.exit(0);
		}		
	}
	
	public boolean canCheckerMove(boolean turn, int x1, int x2, int y1, int y2) {
		if(turn==true) {
			if(map.getMapValues(x1, y1)==2)	{
				if (y2==y1+1 & (x2==x1+1 || x2==x1-1)) {
					return true;
				} 
			}
		} else if(map.getMapValues(x1, y1)==5){
			
			if (y2==y1-1 & (x2==x1+1 || x2==x1-1)) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
	
	public boolean isSpotAvailable(int x2, int y2) {
		if(map.getMapValues(x2, y2)==1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean canCheckerKill(boolean turn, int x1, int x2, int y1, int y2) {
		if(turn==true)	{
			if((map.getMapValues(y1+1, x1+1)==5 || map.getMapValues(y1+1, x1-1)==5) 
					&& (map.getMapValues(y1+2, x1+2)==5 || map.getMapValues(y1+2, x1-1)==5))
			{
				return true;
			} else {
				return false;
			}
		} else if((map.getMapValues(y1-1, x1-1)==2 || map.getMapValues(y1+1, x1-1)==2) 
				&& (map.getMapValues(y1-2, x1+2)==1 || map.getMapValues(y1+2, x1-2)==1))
		{
			return true;
		} else	{
			return false;
		}
	} 
}
