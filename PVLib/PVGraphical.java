package PVLib;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.EventListener;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**This is that graphical class. It is any active that has an image associated with it. It uses the Active interface.
 *  
 * @author John
 */
public class PVGraphical extends JComponent implements PVActive 
{
	private BufferedImage 	img;
	private PVCoordinate 	coord;
	private ActionListener	listener;
	private String			ID;
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 */
	public PVGraphical(){
		this.img = null;
		this.coord = new PVCoordinate(0,0);
		this.listener = null;
		setOpaque( false );
	}
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param img
	 */
	public PVGraphical(BufferedImage img){
		this.img = img;
		this.coord = new PVCoordinate(0,0);
		setBounds( new Rectangle( 0, 0, img.getWidth() , img.getHeight() ) );
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
		setBounds( new Rectangle( this.coord.getX(), this.coord.getY(), img.getWidth() , img.getHeight() ) );
		setOpaque( false );
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
		setBounds( new Rectangle( this.coord.getX(), this.coord.getY(), img.getWidth() , img.getHeight() ) );
	}

	/**
	 * Returns the value of the field called 'coord'.
	 * @return Returns the coord.
	 */
	public PVCoordinate getCoordinate() {
		return this.coord;
	}

	/**
	 * Sets the field called 'coord' to the given value.
	 * @param coord The coord to set.
	 */
	public void setCoordinate(PVCoordinate coord) {
		this.coord = coord;
	}

	public void setCoordinate(int x, int y) {
		this.coord.setX(x);
		this.coord.setY(y);
		
	}
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent( g );
		g.drawImage(this.img, 0, 0, null);
	}


	public boolean isGraphical() {
		return true;
	}

	@Override
	public void setListener( ActionListener ear) {
		this.listener = ear;		
	}

	@Override
	public ActionListener getListener() {
		// TODO Auto-generated method stub
		return this.listener;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	@Override
	public void setID(String ID) {
		this.ID = ID;
		
	}
	
	@Override
	public void move( int x, int y ) {
		this.coord.setX( this.coord.getX() + x );
		this.coord.setY( this.coord.getY() + y );
		setBounds( new Rectangle( this.coord.getX(), this.coord.getY(), this.img.getWidth() , this.img.getHeight() ) );
	}
}
