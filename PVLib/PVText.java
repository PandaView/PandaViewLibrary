package PVLib;

import java.awt.Font;
import java.util.EventListener;

public class PVText implements PVActive {
	
	PVCoordinate 	pos;
	String 			text_str;
	int 			font_size;
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
	
	@Override
	public PVCoordinate getCoordinate() {
		return this.pos;
	}

	@Override
	public void setCoordinate(int x, int y) {
		this.pos.setX(x);
		this.pos.setY(y);

	}

	@Override
	public void move(int x, int y) {
		this.pos.setX( this.pos.getX() + x );
		this.pos.setY( this.pos.getY() + y );
	}

	@Override
	public void setListener(EventListener ear) {
		// TODO Auto-generated method stub

	}

	@Override
	public EventListener getListener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGraphical() {
		return true;
	}

	@Override
	public String getID() {
		return ID;
	}

	@Override
	public void setID( String id ) {
		this.ID = id;		
	}

}
