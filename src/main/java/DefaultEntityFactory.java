/**
 * DefaultEntityFactory: concrete factory for creating standard game entities.
 */
public class DefaultEntityFactory implements EntityFactory {
    @Override
    public Alien createAlien(int x, int y) {
        return new Alien(x, y);
    }

    @Override
    public Player createPlayer() {
        return new Player();
    }

    @Override
    public Shot createShot(int x, int y) {
        return new Shot(x, y);
    }
}
