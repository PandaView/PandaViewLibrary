package PVLib;

import javax.swing.JFrame;

/**
 * 
 * 
 * @author John. Created Apr 15, 2013.
 */
@SuppressWarnings("serial")
public abstract class PVExistence extends JFrame
{

	// private ArrayList<Active> actives;
	// private PVBackground bkg;

	public PVExistence(String appName)
	{
		super(appName);

	}

	protected abstract void setActives();

	protected abstract void setPVBackground();

}
