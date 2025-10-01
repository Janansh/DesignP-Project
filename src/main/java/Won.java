

/**
 * 
 * @author 
 */
public class Won extends Sprite implements Commons{
    private final String won = "/img/won.jpg";
    private int width;

    /*
     * Constructor
     */
    public Won() {

        
        width = (getImage() == null ? Commons.PLAYER_WIDTH : getImage().getWidth(null)); 

        setImage(ResourceManager.getInstance().getImage(won));
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
