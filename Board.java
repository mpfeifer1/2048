public class Board {
	/*This Class should contain:
	 *  The Tiles
	 *  How the tiles move and spawn
	 *  Tile Spawn
	 *  How you can move, or whether you've lost
	 */

	Tile[][] tiles;
	

	public board() {
		tiles = new Tile[4][4];
		spawnTile();
		spawnTile();
	}
	
	
	public boolean canMove() {
		return false; //TODO
	}
	
	public boolean moveTiles(int direction) { 
		//Left = 1,  Right = 2,  Up = 3,  Down = 4,  Error = 0
		switch(direction) {
			case 0:
				return false;
				break;
			case 1:
				moveTilesLeft();
				return true;
				break;
			case 2:
				moveTilesRight();
				return true;
				break;
			case 3:
				moveTilesUp();
				return true;
				break;
			case 4:
				moveTilesDown();
				return true;
				break;
			default:
				return false;
				break;
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

	public boolean checkLost() {
		return !canMove;
	}
	
	public boolean checkWon() {
		for(Tile tile : tiles) {
			if(tile.level >= 11)
				return true;
		}
			return false;
	}

	public void spawnTile() {
		int nulls = 0;
		for(Tile tile : tiles {
			if(tile == null)
				nulls++
			}
		}
		//TODO set "n" to randint between 1 and nulls
		//place tile on "n"th null square
	}
}
