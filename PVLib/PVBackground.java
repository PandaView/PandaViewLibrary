package PVLib;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
/**
 * 
 * This class provides a background for a gui. It is meant to be stationary, but can be moved and changed. 
 * It is an abstract class so that basic methods need not be rewritten.
 *
 * @author John
 */
public class PVBackground extends JComponent{
	//the image to get displayed as the background
	private BufferedImage bkg;
	
	/**
	 * 
	 * A constructor that takes in a BufferedImage to make as the background
	 *
	 * @param img the image that will be the background
	 */
	public PVBackground(BufferedImage img)
	{
		this.bkg = img;
		setBounds( new Rectangle( 0, 0 , img.getWidth() , img.getHeight() ) );
	}
	/**
	 * 
	 * A black constructor that sets the image variable to null.
	 *
	 */
	public PVBackground()
	{
		this.bkg = null;
	}
	/**
	 * 
	 * the setter for the global image variable. 
	 *
	 * @param img the image to set
	 */
	public void setImage(BufferedImage img){
		this.bkg = img;
		setBounds( new Rectangle( 0, 0 , img.getWidth() , img.getHeight() ) );
	}
	/**
	 * 
	 * this is the getter for the image that the background is using.
	 *
	 * @return the BufferedImage that the background is using
	 */
	public BufferedImage getImage(){
		return this.bkg;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.bkg, 0,  0,null);
	}

}
