import java.awt.Color;

public class Tile {
	/*This Class should contain:
	 *  Constructor for Tiles
	 *  Color and Number of Tiles
	 */

	public int     level;
	public Color   color;
	public boolean active

	public Tile() {
		active = false;
		level  = 1; //Make possibility of being a level 2
		// Level one = 2, Level two = 4, Level three = 8, etc...
		color  = this.getColor(this);
	}

	public Color getColor(Tile t) {
		return new Color((212 - t.level),
				 (229 - (17 * (t.level - 1))),
				  0);
	}

	public boolean getActive() {
		return this.active;
	}

	public boolean getLevel() {
		return this.level;
	}

	public void setActive(Tile t, boolean newState) {
		t.active = newState;
	}

	public void increaseLevel(Tile t) {
		t.level++;
	}

	public void wipeTile(Tile t) {
		t.level  = 0;
		t.active = false;
	}
}
