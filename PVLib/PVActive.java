package PVLib;

import java.util.EventListener;

/**
 * This class defines an "active" object, or an object that has a position and is not a background.
 *
 * @author John.
 *         Created April 24, 2013.
 */
public interface PVActive {
	/**
	 * This method returns the coordinate object of the Active child
	 *
	 * @return the Coordinate of the position of the object
	 */
	public PVCoordinate getCoordinate();
	/**
	 * Sets the Coordinate of the active object
	 *
	 * @param x the x coordinate you want to set
	 * @param y the y coordinate you want to set
	 */
	public void setCoordinate(int x, int y);
	/**
	 * moves the coordinate +x to the right and +y down
	 *
	 * @param x the distance you want the coordinate moved right
	 * @param y the distance you want the coordinate moved down
	 */
	public void move(int x, int y);
	
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param ear
	 */
	public void setListener(EventListener ear);
	
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	public EventListener getListener();
	/**
	 * 
	 */
	public boolean isGraphical();
}
