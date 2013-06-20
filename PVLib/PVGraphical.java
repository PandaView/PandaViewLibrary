package PVLib;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

/**This is that graphical class. It is any active that has an image associated with it. It uses the Active interface.
 *  
 * @author John
 */
public abstract class PVGraphical extends JComponent implements PVActive 
{
	private BufferedImage img;
	private PVCoordinate coord;
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 */
	public PVGraphical(){
		this.img = null;
		this.coord = new PVCoordinate(0,0);
	}
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param img
	 */
	public PVGraphical(BufferedImage img){
		this.img = img;
		this.coord = new PVCoordinate(0,0);
	}
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param img
	 * @param pos
	 */
	public PVGraphical(BufferedImage img, PVCoordinate pos){
		this.img = img;
		this.coord = pos;
	}

	/**
	 * Returns the value of the field called 'img'.
	 * @return Returns the img.
	 */
	public BufferedImage getImg() {
		return this.img;
	}

	/**
	 * Sets the field called 'img' to the given value.
	 * @param img The img to set.
	 */
	public void setImg(BufferedImage img) {
		this.img = img;
	}

	/**
	 * Returns the value of the field called 'coord'.
	 * @return Returns the coord.
	 */
	public PVCoordinate getCoord() {
		return this.coord;
	}

	/**
	 * Sets the field called 'coord' to the given value.
	 * @param coord The coord to set.
	 */
	public void setCoord(PVCoordinate coord) {
		this.coord = coord;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.img,this.coord.getX(), this.coord.getY(),null);
	}
}
