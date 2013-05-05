
/**
 * This class defines an "active" object, or an object that has a position and is not a background.
 *
 * @author John.
 *         Created Apr 24, 2013.
 */
public interface Active {
	/**
	 * This method returns the coordinate object of the Active child
	 *
	 * @return the Coordinate of the position of the object
	 */
	public Coordinate getCoordinate();
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
}
