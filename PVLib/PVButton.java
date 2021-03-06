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
	private				BufferedImage	cur_bg;
	private 			PVCoordinate	size;
	private 			boolean			resize = false;
	private 			int 			textX;
	private 			int 			textY;
	private				BufferedImage	next_bg = null;
	
	public PVButton( BufferedImage bg, String text, PVCoordinate pos ) {
		super( bg );
		super.setCoordinate(pos);
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		this.bg = bg;
		this.str = new PVText( text );
		this.size = new PVCoordinate( this.bg.getWidth(), this.bg.getHeight() );
		super.setBounds( new Rectangle( super.getCoordinate().getX(), super.getCoordinate().getY(), this.size.getX() , this.size.getY() ) );
		alignText();
		this.cur_bg = bg;
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
		this.cur_bg = bg;
	}
	
	public void setTextColor( Color color ) {
		this.str.setColor( color );
	}
	
	public void setTextSize( int size ) {
		this.str.setFontSize( size );
	}
	
	public void enableBackgroundResize() {
		this.resize = true;
	}
	
	public void alignText() {
		this.textX = ( this.size.getX() ) / 4 ;
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
			
			g.drawImage( this.cur_bg, 0, 0, this.size.getX(), this.size.getY(), null);
		}
		else {
						
			g.drawImage( this.cur_bg, 0, 0, null);
		}
		
		g.setColor( this.str.getColor() );
		g.setFont( this.str.getFont() );
		g.drawString( this.str.getText(), this.textX , this.textY );
	}
	
	@Override
	protected void processEvent( AWTEvent e){
		if( super.getListener() != null){
			super.getListener().actionPerformed(new ActionEvent(this, e.getID(), e.paramString()) );
		}
		
		if( this.next_bg != null ){
			if ( e.getID() == MouseEvent.MOUSE_ENTERED ){
				this.cur_bg = this.next_bg;
			}
			if ( e.getID() == MouseEvent.MOUSE_EXITED ){
				this.cur_bg = this.bg;
			}
		}
	}
	
	public void setAlternate( BufferedImage img ){
		this.next_bg = img;
	}
	
	@Override
	public void move( int x, int y ) {
		super.setCoordinate( super.getCoordinate().getX() + x , super.getCoordinate().getY() + y );
		super.setBounds( new Rectangle( super.getCoordinate().getX(), super.getCoordinate().getY(), this.size.getX() , this.size.getY() ) );
	}
	
}
