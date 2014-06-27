//Joel R. Youngberg

package calclayout;

import java.net.URL;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @author Joel R. Youngberg
 */
public class SplyAlctr {
    private static final Logger logger = Logger.getLogger(SplyAlctr.class.getName());

    private final Class demoClass;

    // Resource bundle for internationalized and accessible text
    private ResourceBundle bundle = null;

    public SplyAlctr(Class demoClass) {
        this.demoClass = demoClass;

        String bundleName = demoClass.getPackage().getName() + ".resources." + demoClass.getSimpleName();

    }

    public String getString(String key) {
        return bundle != null ? bundle.getString(key) : key;
    }

    public char getMnemonic(String key) {
        return (getString(key)).charAt(0);
    }

    public ImageIcon createImageIcon(String filename, String description) {
        String path = "resources/images/" + filename;

        URL imageURL = demoClass.getResource(path);

        if (imageURL == null) {
            logger.log(Level.SEVERE, "unable to access image file: " + path);

            return null;
        } else {
            return new ImageIcon(imageURL, description);
        }
    }
}
