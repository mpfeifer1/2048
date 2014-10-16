public class Game {
	/*Use this class to:
	 *  Initialize Board
	 *  Spawn 1 Tile
	 *  Start Main Loop
	 */

	/*Use the main loop to:
	 * 	Spawn New Tile
	 *  Display Board and Tiles
	 *  Move Tiles based on Input
	 *  Check That Game isn't Over
	 */
	
	/*This Class should contain:
	 *  The Main Structure and Loop
	 */	
	
	public boolean lost;
	public int score;
	
	public Game() {
		Board board = new Board();
		User user = new User();
		lost = false;
		score = 0;
		
		board.spawnTile();
		
		while(!lost) {
			board.spawnTile();
			board.display();
			board.moveTiles(user.getInput()); //Left = 1,  Right = 2,  Up = 3,  Down = 4,  Error = 0
			lost = board.checkLost();
		}
	}
}