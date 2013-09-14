package PVLib;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import sun.awt.image.ToolkitImage;

public class PVButton extends PVGraphical {

	private 			PVText 			str;
	private 			BufferedImage 	bg;
	private 			PVCoordinate	size;
	private 			boolean			resize = false;
	private 			int 			textX;
	private 			int 			textY;
	
	public PVButton( BufferedImage bg, String text, PVCoordinate pos ) {
		super( bg );
		super.setCoord(pos);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = new PVCoordinate( this.bg.getWidth(), this.bg.getHeight() );
		alignText();
	}
	
	public PVButton( BufferedImage bg, String text, PVCoordinate size, PVCoordinate pos ) {
		super( bg );
		super.setCoord(pos);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = size;
		alignText();
	}
	
	public void setTextColor( Color color ) {
		this.str.setColor( color );
	}
	
	public void enableBackgroundResize() {
		this.resize = true;
	}
	
	public void alignText() {
		this.textX = ( this.size.getX() ) / 2 ;
		this.textY = ( this.size.getY() / 2 ) + ( this.str.getFontSize() / 4 ) ;
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
		System.out.println( "x: "+this.textX+" y: "+this.textY );
		g.drawString( this.str.getText(), super.getX() + this.textX , this.textY );
	}
	
}
