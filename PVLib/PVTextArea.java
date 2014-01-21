package PVLib;

import java.awt.Graphics;
import java.awt.Rectangle;

public class PVTextArea extends PVGraphical {

	private PVText str;
	private int textX;
	private int textY;
	
	
	
	public PVTextArea(){
		this.str = new PVText("");
		this.textX = 0;
		this.textY = 0;
	}
	
	public PVTextArea(String str){
		this.str = new PVText(str);
		this.textX = 0;
		this.textY = 0;
	}
	
	public PVTextArea(String str, PVCoordinate coord){
		this.str = new PVText(str);
		this.textX = coord.getX();
		this.textY = coord.getY();
	}
	
	public PVTextArea(String str, int x, int y){
		this.str = new PVText(str);
		this.textX = x;
		this.textY = y;
		super.setBounds( new Rectangle( this.textX, this.textY, 300 , 2*this.str.font_size ) );
	}
	
	public void setCoord( int x, int y){
		this.textX = x;
		this.textY = y;
	}
	
	public String getText(){
		return this.str.getText();
	}
	
	public PVText getPVText(){
		return this.str;
	}
	
	public void setPVText(PVText str){
		this.str = str;
	}
	
	public void setText(String str){
		this.str.setText(str);
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent( g );
		g.setColor( this.str.getColor() );
		g.setFont( this.str.getFont() );
		g.drawString( this.str.getText(), this.textX , this.textY );
	}
}
