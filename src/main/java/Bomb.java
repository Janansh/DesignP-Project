

/**
 * 
 * @author 
 */
public class Bomb extends Sprite {

	private final String bomb = "/img/bomb.png";
	private boolean destroyed;

	/*
	 * Constructor
	 */
	public Bomb(int x, int y) {
		setDestroyed(true);
		this.x = x;
		this.y = y;
				setImage(ResourceManager.getInstance().getImage(bomb));
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public boolean isDestroyed() {
		return destroyed;
	}
}
