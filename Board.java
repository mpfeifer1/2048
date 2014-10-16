import java.util.ArrayList;

public class Board {
	/*This Class should contain:
	 *  The Tiles
	 *  How the tiles move and spawn
	 *  Tile Spawn
	 *  How you can move, or whether you've lost
	 */

	ArrayList<Tile> tiles = new ArrayList<Tile>();
	
	
	public boolean canMove() {
		return false; // TODO
	}
	
	public void moveTiles(int direction) { 
		//Left = 1,  Right = 2,  Up = 3,  Down = 4,  Error = 0
		// TODO Auto-generated method stub
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public boolean checkLost() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean checkWon() {
		for(Tile tile : tiles) {
			if(tile.level >= 11)
				return true;
		}
			return false;
	}

	public void spawnTile() {
		// TODO Auto-generated method stub
	}
}
