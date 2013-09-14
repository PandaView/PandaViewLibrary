package PVLib;

import java.awt.Color;
import java.awt.Font;
import java.util.EventListener;

public class PVText {
	
	PVCoordinate 	pos;
	String 			text_str;
	int 			font_size;
	Color			font_color = Color.BLACK;
	Font 			font;
	String 			ID;
	

	
	public PVText(String text_str, int font_size, Font font, PVCoordinate coord) {
		this.text_str = text_str;
		this.font_size = font_size;
		this.pos = coord;
		this.font = font;
	}
	public PVText(String text_str, int font_size, PVCoordinate coord) {
		this.text_str = text_str;
		this.font_size = font_size;
		this.pos = coord;
		this.font = Font.getFont( Font.SANS_SERIF );
	}
	
	public PVText(String text_str, PVCoordinate coord) {
		this.text_str = text_str;
		this.font_size = 16;
		this.pos = coord;
		this.font = Font.getFont( Font.SANS_SERIF );
	}
	
	public PVText(String text_str) {
		this.text_str = text_str;
		this.font_size = 16;
		this.pos = new PVCoordinate();
		this.font = Font.getFont( Font.SANS_SERIF );
	}
	
	public String getText() {
		return this.text_str;
	}

	public void setText(String str) {
		this.text_str = str;
	}
	
	public void setFontSize( float size ) {
		this.font = this.font.deriveFont(size);	
	}
	
	public void setFont( Font font ) {
		this.font = font;
	}
	
	public Font getFont() {
		return this.font;
	}
	public void setColor( Color clr ) {
		this.font_color = clr;
	}
	
	public Color getColor() {
		return this.font_color;
	}
	
	public PVCoordinate getCoordinate() {
		return this.pos;
	}

	public void setCoordinate(int x, int y) {
		this.pos.setX(x);
		this.pos.setY(y);

	}

	public void move(int x, int y) {
		this.pos.setX( this.pos.getX() + x );
		this.pos.setY( this.pos.getY() + y );
	}
	public int getFontSize() {
		
		return this.font_size;
	}

}
