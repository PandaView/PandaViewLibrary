
/**This is that graphical class. It is any active that has an image associated with it. It uses the Active interface.
 *  
 * @author John
 */
import java.awt.image.BufferedImage;


public interface Graphical extends Active {
	
	/**
	 * This method sets the image of a Graphical subclass.
	 * @param img The image to be set on the screen
	 */
	public void setImage(BufferedImage img);
	/**
	 * Returns the image of the Graphical subclass.
	 * @return
	 */
	public BufferedImage getImage();
}
