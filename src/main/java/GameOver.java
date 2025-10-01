

/**
 * 
 * @author
 */
public class GameOver extends Sprite implements Commons {

	private final String gameOver = "/img/gameover.png";
	private int width;

	/*
	 * Constructor
	 */
	public GameOver() {
		
		if (getImage() == null) { System.err.println("Missing resource: " + gameOver); setWidth(Commons.PLAYER_WIDTH); } else { setWidth(getImage().getWidth(null)); }

		setImage(ResourceManager.getInstance().getImage(gameOver));
		setX(0);
		setY(0);
	}

	/*
	 * Getters & Setters
	 */

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
