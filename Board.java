public class Board {
	/*This Class should contain:
	 *  The Tiles
	 *  Tile Moving
	 *  Tile Spawning
	 *  Getting and setting rows and tiles
	 *  Checking for matching tiles
	 *  How you can move
	 *  If you've lost
	 *  Whether The Screen is full
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

	public void setRow(Tile[] tiles) {
		//TODO
	}

	public void setColumn(Tile[] tiles) {
		//TODO
	}

	public boolean matchingTiles(Tile[][] tiles) {
		//Fix to incorporate "tiles" paramater
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

	public boolean matchingTilesRow(Tile[] tiles) {
		return (tilesMatch(tiles[0], tiles[1] ||
			tilesMatch(tiles[1], tiles[2] ||
			tilesMatch(tiles[2], tiles[3])
	}

	public boolean tilesMatch(Tile a, Tile b) {
		return (a.getLevel() == b.getLevel());
	}

	public boolean canMove() {
		if(!screenFilled() || matchingTiles(tiles)) {
			return true;
		}
		return false;
	}

	public boolean moveTiles(int direction, Tile[] tiles) {
		//Left = 1,  Right = 2,  Up = 3,  Down = 4,  Error = 0
		switch(direction) {
			case 0:
				return false;
				break;
			case 1:
				moveTilesLeft(tiles);
				return true;
				break;
			case 2:
				moveTilesRight(tiles);
				return true;
				break;
			case 3:
				moveTilesUp(tiles);
				return true;
				break;
			case 4:
				moveTilesDown(tiles);
				return true;
				break;
			default:
				return false;
				break;
	}

	public void moveTilesUp(Tile[] tiles) {
		for(int column = 0; column++; column <= 3) {
			//do stuff to
			setColumn(getColumn(tiles));
		}
	}

	public void moveTilesDown(Tile[] tiles) {
                for(int column = 0; column++; column <= 3) {
                        //do stuff to
                        setColumn(getColumn(tiles));
                }

	}

	public void moveTilesLeft(Tile[] tiles) {
                for(int row = 0; row++; row <= 3) {
                        //do stuff to
                        setRow(getRow(tiles));
                }
	}

	public void moveTilesRight {
                for(int row = 0; row++; row <= 3) {
                        //do stuff to
                        setRow(getRow(tiles));
                }
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
		//Add check for whether screen is full (just to be sure)
		boolean set = false;
		Random generator = new Random();
		while(!set) {
			int row    = randInt(0,3);
			int column = randInt(0,3);
			int level  = randInt(); //Finish This
			if (!tiles[column][row].getActive()) {
				tiles[column][row] = new Tile();
				set = true;
			}
		}
	}
}
