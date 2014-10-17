public class Board {
	/*This Class should contain:
	 *  The Tiles
	 *  How the tiles move and spawn
	 *  Tile Spawn
	 *  How you can move, or whether you've lost
	 */

	Tile[] tiles;
	

	public board() {
		tiles = {0,0,0,0,
			 0,0,0,0,
			 0,0,0,0,
			 0,0,0,0};
		spawnTile();
		spawnTile();
	}
	
	
	public boolean canMove() {
		return false; //TODO
	}
	
	public void moveTiles(int direction) { 
		//Left = 1,  Right = 2,  Up = 3,  Down = 4,  Error = 0
		//TODO Auto-generated method stub
	}

	public void moveTilesUp() {
		//TODO
	}
	
	public void moveTilesDown() {
		//TODO
	}

	public void moveTilesLeft() {
		//TODO
	}

	public void moveTilesRight {
		//TODO
	}

	public void display() {
		//TODO
		
	}

	public boolean checkLost() {
		//TODO
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
		//TODO
	}
}
