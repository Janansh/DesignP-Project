


public class Shot extends Sprite {

    private String shot = "/img/shot.png";
    private final int H_SPACE = 6;
    private final int V_SPACE = 1;

    public Shot() {
    }

    public Shot(int x, int y) {

                setImage(ResourceManager.getInstance().getImage(shot));
        setX(x + H_SPACE);
        setY(y - V_SPACE);
    }
}