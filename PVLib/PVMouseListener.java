package PVLib;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public abstract class PVMouseListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getID()){		
			case MouseEvent.MOUSE_PRESSED : mousePressed(); break;
			case MouseEvent.MOUSE_ENTERED : mouseEntered(); break;
			case MouseEvent.MOUSE_CLICKED : mouseClicked(); break;
			case MouseEvent.MOUSE_EXITED : mouseExited(); break;
			case MouseEvent.MOUSE_RELEASED : mouseReleased(); break;
			case MouseEvent.MOUSE_MOVED : mouseMoved(); break;		
		}
		
	}


	public abstract void mousePressed();
	public abstract void mouseEntered();
	public abstract void mouseExited();
	public abstract void mouseReleased();
	public abstract void mouseMoved();
	public abstract void mouseClicked();
	

}
