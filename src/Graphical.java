import java.awt.image.BufferedImage;


public interface Graphical extends Active {
	public void setImage(BufferedImage img);
	public BufferedImage getImage();
}
