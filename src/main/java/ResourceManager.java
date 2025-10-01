import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.net.URL;

/**
 * ResourceManager (Singleton): centralizes and caches image loading.
 */
public class ResourceManager {
    private static ResourceManager instance;
    private final Map<String, Image> cache = new HashMap<>();

    private ResourceManager() {}

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public Image getImage(String path) {
        if (cache.containsKey(path)) return cache.get(path);
        URL url = this.getClass().getResource(path);
        Image img;
        if (url == null) {
            System.err.println("Resource not found on classpath: " + path);
            img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        } else {
            img = new ImageIcon(url).getImage();
        }
        cache.put(path, img);
        return img;
    }
}
