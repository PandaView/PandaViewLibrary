package PVLib;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 * 
 * This class provides a background for a gui. It is meant to be stationary, but can be moved and changed. 
 * It is an abstract class so that basic methods need not be rewritten.
 *
 * @author John
 */
@SuppressWarnings("serial")
public abstract class PVBackground extends JComponent
{
	private BufferedImage bkg;
	public PVBackground(BufferedImage img)
	{
		this.bkg = img;
	}
	
	public PVBackground()
	{
		this.bkg = null;
	}

	public void setImage(BufferedImage img){
		this.bkg = img;
	}

	public BufferedImage getImage(){
		return this.bkg;
	}

	protected abstract void paintComponent(Graphics g);
}
