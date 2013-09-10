package PVLib;

import java.awt.Font;
import java.util.EventListener;

public class PVText implements PVActive {
	
	String text_str;
	int font_size;
	Font font;
	String ID;
	

	
	public PVText(String text_str, int font_size, Font font) {
		this.text_str = text_str;
		this.font_size = font_size;
		this.font = font;
	}

	@Override
	public PVCoordinate getCoordinate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCoordinate(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void setID( String id ) {
		this.ID = id;		
	}

}
