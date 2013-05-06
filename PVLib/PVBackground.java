
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;


public abstract class PVBackground extends JComponent {
	public PVBackground(){
		
	}
	public abstract void setImage(BufferedImage img);
	public abstract BufferedImage getImage();
	protected abstract void paintComponent(Graphics g);
}
