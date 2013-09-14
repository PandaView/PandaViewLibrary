package PVLib;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class PVButton extends PVGraphical {

	private 			PVText 			str;
	private 			BufferedImage 	bg;
	private 			PVCoordinate	size;
	private 			boolean			resize = false;
	private 			int 			textX;
	private 			int 			textY;
	
	public PVButton( BufferedImage bg, String text, PVCoordinate pos ) {
		super( bg );
		super.setCoordinate(pos);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = new PVCoordinate( this.bg.getWidth(), this.bg.getHeight() );
		super.setBounds( new Rectangle( super.getCoordinate().getX(), super.getCoordinate().getY(), this.size.getX() , this.size.getY() ) );
		alignText();
	}
	
	public PVButton( BufferedImage bg, String text, PVCoordinate size, PVCoordinate pos ) {
		super( bg );
		super.setCoordinate(pos);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = size;
		super.setBounds( new Rectangle( super.getCoordinate().getX(), super.getCoordinate().getY(), this.size.getX() , this.size.getY() ) );
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
		//super.setBounds( super.getCoordinate().getX(), super.getCoordinate().getY(), this.size.getX(), this.size.getY() );
		System.out.println( "repainting button at :"+super.getCoordinate().getX()+ ", "+ super.getCoordinate().getY() );
		if ( this.resize ) {
			g.drawImage( this.bg, 0, 0, this.size.getX(), this.size.getY(), null);
		}
		else {
			
			
			g.drawImage( this.bg, 0, 0, null);
		}
		
		g.setColor( this.str.getColor() );
		g.setFont( this.str.getFont() );
		g.drawString( this.str.getText(), this.textX , this.textY );
	}
	
	@Override
	protected void processEvent( AWTEvent e){
		
		if ( super.getListener() != null ){
			if ( e.getID() == MouseEvent.MOUSE_PRESSED ){
				System.out.println( "Mouse Pressed" );
				super.getListener().actionPerformed( new ActionEvent( this, ActionEvent.ACTION_PERFORMED, null ));
			}
		}
		
	}
	@Override
	public void move( int x, int y ) {
		System.out.println( "button at : "+ (super.getCoordinate().getX() + x )+", "+( super.getCoordinate().getY() + y ) );
		super.setCoordinate( super.getCoordinate().getX() + x , super.getCoordinate().getY() + y );
		super.setBounds( new Rectangle( super.getCoordinate().getX(), super.getCoordinate().getY(), this.size.getX() , this.size.getY() ) );
		//repaint();
	}
	
}
