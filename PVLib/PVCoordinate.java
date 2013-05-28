package PVLib;

public class PVCoordinate
{
	private int x;
	private int y;

	public PVCoordinate(int h, int v)
	{
		x = h;
		y = v;
	}

	public PVCoordinate(PVCoordinate c)
	{
		this.x = c.getX();
		this.y = c.getY();
	}

	public PVCoordinate()
	{
		x = 0;
		y = 0;
	}

	public void setCoordinate(int h, int v)
	{
		x = h;
		y = v;
	}

	public void setX(int h)
	{
		x = h;
	}

	public void setY(int v)
	{
		y = v;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void move(int h, int v)
	{
		this.x += h;
		this.y += v;
	}

	public void moveTo(int h, int v)
	{
		x = h;
		y = v;
	}
}
