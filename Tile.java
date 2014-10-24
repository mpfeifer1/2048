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
		level  = 1;
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
}
