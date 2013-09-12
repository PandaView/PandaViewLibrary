package PVLib;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class PVButton extends PVGraphical {

	PVText 			str;
	BufferedImage 	bg;
	public PVButton( BufferedImage bg, String text, PVCoordinate pos ) {
		super();
		super.setCoord(pos);
		this.bg = bg;
		this.str = new PVText( text );
		makeImg();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent( g );
		g.drawImage( this.bg, super.getX(), super.getY(), null);
		g.setColor( Color.cyan );
		g.drawString( this.str.getText(), super.getX() + 10 , super.getY() + 20 );
	}
	
	private void makeImg() {
		Graphics g = this.bg.getGraphics();
		g.drawString( this.str.getText(), this.str.getCoordinate().getX(), this.str.getCoordinate().getY() );
		
		super.setImg( this.bg );
		
	}
}
