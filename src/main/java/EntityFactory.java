/**
 * EntityFactory (Factory Method): abstracts creation of game entities.
 */
public interface EntityFactory {
    Alien createAlien(int x, int y);
    Player createPlayer();
    Shot createShot(int x, int y);
}
