public class Game {
	/*Use this class to:
	 *  Initialize Board
	 *  Spawn 1 Tile
	 *  Start Main Loop
	 */

	/*Use the main loop to:
	 *  Spawn New Tile
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
		Window window = new Window();
		lost = false;
		score = 0;
		
		while(!lost) {
			board.spawnTile();
			Window.display(board);
			board.moveTiles(user.getInput());
			//Left = 1,  Right = 2,  Up = 3,  Down = 4,  Error = 0
			Window.display(board)
			lost = board.checkLost();
		}
		//TODO add "New Game" option
	}
}
