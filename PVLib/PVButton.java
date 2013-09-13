package PVLib;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import sun.awt.image.ToolkitImage;

public class PVButton extends PVGraphical {

	PVText 			str;
	BufferedImage 	bg;
	PVCoordinate	size;
	boolean			resize = false;
	
	public PVButton( BufferedImage bg, String text, PVCoordinate pos ) {
		super( bg );
		super.setCoord(pos);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = new PVCoordinate( this.bg.getWidth(), this.bg.getHeight() );
	}
	
	public PVButton( BufferedImage bg, String text, PVCoordinate size, PVCoordinate pos ) {
		super( bg );
		super.setCoord(pos);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = size;
	}
	
	public void setTextColor( Color color ) {
		this.str.setColor( color );
	}
	
	public void enableBackgroundResize() {
		this.resize = true;
	}
	
	@Override
	public void setFont( Font font ) {
		this.str.setFont( font );
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent( g );
		if ( this.resize ) {
			g.drawImage( this.bg, super.getX(), super.getY(), this.size.getX(), this.size.getY(), null);
		}
		else {
			
			g.drawImage( this.bg, super.getX(), super.getY(), null);
		}
		super.setBounds( super.getX(), super.getY(), this.size.getX(), this.size.getY() );
		g.setColor( this.str.getColor() );
		g.setFont( this.str.getFont() );
		g.drawString( this.str.getText(), super.getX() + 10 , super.getY() + 20 );
	}
	
}
