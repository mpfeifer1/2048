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


        public int randInt(int min, int max) {
                Random rand = new Random();
                int randomNum = rand.nextInt((max - min) + 1) + min;
                return randomNum;
        }

	public boolean screenFilled() {
		for(Tile tile : tiles) {
			if(!tile.getActive()) {
				return false;
			}
		}
		return true;
	}

	public Tile[] getRow(int row) {
		Tile[] tiles = tiles[][row];
	}

	public Tile[] getColumn(int column) {
		Tile[] tiles = tiles[column][];
	}

	public boolean matchingTiles(Tile[][]) {
		boolean matching = false;
		for(int row = 0; row++; row <= 3) {
			if(matchingTilesRow(getRow(row))) {
				matching = true;
			}
		}
		for(int column = 0; column++; column <= 3)
			if(matchingTilesRow(getColumn(column))) {
				matching = true;
			}
		}
		return matching;
	}

	public boolean matchingTilesRow(Tile[]) {
		return (tilesMatch(Tile[0], Tile[1] ||
			tilesMatch(Tile[1], Tile[2] ||
			tilesMatch(Tile[2], Tile[3])
	}

	public boolean tilesMatch(Tile a, Tile b) {
		return (a.getLevel() == b.getLevel());
	}

	public boolean canMove() {
		if(!screenFilled) { // or If matching tiles near each other
			return true;
		}
		return false;
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
		for(Tile tile : tiles) {
			if(tile.getActive() == false)
				nulls++;
			}
		}
		int chosenTile = randInt(0, nulls);
		//TODO set "n" to randint between 1 and nulls
		//place tile on "n"th null square
	}
}
