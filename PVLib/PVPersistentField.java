package PVLib;

/**
 * This is an abstract class. It uses the Active interface, but not the
 * Graphical. The class could use Graphical if there is an image or animation
 * associated with the field. However it is recommended not to use the Graphical
 * interface.
 * 
 * @author John
 * 
 */
public abstract class PVPersistentField implements PVActive
{

	private PVCoordinate center;
	private int radius;
	
	/**
	 * This constructor
	 * 
	 * @param c
	 */
	public PVPersistentField(PVCoordinate c)
	{
		center = c;
		radius = 0;
	}
	

	public PVPersistentField(PVCoordinate c, int radius)
	{
		center = c;
		this.radius = radius;
	}

	@Override
	public PVCoordinate getCoordinate()
	{
		return center;
	}

	@Override
	public void setCoordinate(int x, int y)
	{
		center.moveTo(x, y);
	}

	@Override
	public void move(int x, int y)
	{
		center.move(x, y);
	}

	//Presumably it's a circle, correct?  I mean, it has a radius and a centerpoint...
	public boolean inside(int x, int y)
	{
		x -= center.getX();
		y -= center.getY();
		return (x*x + y*y) <= radius * radius;
	}
}
