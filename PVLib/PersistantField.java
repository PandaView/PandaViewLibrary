
/**This is an abstract class. It uses the Active interface, but not the Graphical. The class could use Graphical if there is an image
 * or animation associated with the field. However it is recommended not to use the Graphical interface.
 * 
 * @author John
 *
 */
public abstract class PersistantField implements Active {

	private Coordinate center;
	private int radius;
	
	/**This constructor 
	 * 
	 * @param c
	 */
	public PersistantField(Coordinate c){
		this.center = c;
	}
	@Override
	public Coordinate getCoordinate() {
		// TODO Auto-generated method stub
		return this.center;
	}

	@Override
	public void setCoordinate(int x, int y) {
		// TODO Auto-generated method stub
		this.center.x =x;
		this.center.y =y;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

}
