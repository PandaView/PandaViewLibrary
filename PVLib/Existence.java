package PVLib;

import javax.swing.JFrame;

/**
 * 
 * 
 * @author John. Created Apr 15, 2013.
 */
@SuppressWarnings("serial")
public abstract class Existence extends JFrame
{

	// private ArrayList<Active> actives;
	// private PVBackground bkg;

	public Existence(String appName)
	{
		super(appName);

	}

	protected abstract void setActives();

	protected abstract void setPVBackground();

}
