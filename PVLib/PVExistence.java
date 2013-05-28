package PVLib;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * 
 * 
 * @author John. Created Apr 15, 2013.
 */
@SuppressWarnings("serial")
public abstract class PVExistence extends JFrame
{

	private ArrayList<PVActive> actives;
	private PVBackground bkg;
	private GridBagLayout layout;
	private PVCoordinate endPoint;
	private Container container;

	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param appName
	 */
	public PVExistence(String appName)
	{
		super(appName);
		this.container = this.getContentPane();
		this.layout = new GridBagLayout();
		this.container.setLayout(this.layout);
		this.bkg = createPVBackground();
		this.actives = createPVActives();
		this.endPoint = new PVCoordinate();

	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	protected abstract ArrayList<PVActive> createPVActives();
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	protected abstract PVBackground createPVBackground();
	
	
	@Override
	public void setSize(int x, int y){
		this.container.setSize(x,y);
		this.endPoint.setX(x);
		this.endPoint.setY(y);
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param rowHeights
	 */
	public void setRows(int[] rowHeights){
		this.layout.rowHeights = rowHeights;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param columnWidths
	 */
	public void setColumns(int[] columnWidths){
		this.layout.columnWidths = columnWidths;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	public int[] getRows(){
		return this.layout.rowHeights;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	public int[] getColumns(){
		return this.layout.columnWidths;
	}

	/**
	 * Returns the value of the field called 'layout'.
	 * @return Returns the layout.
	 */
	public GridBagLayout getLayout() {
		return this.layout;
	}
	/**
	 * Sets the field called 'layout' to the given value.
	 * @param layout The layout to set.
	 */
	public void setLayout(GridBagLayout layout) {
		this.layout = layout;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param actives
	 */
	protected void setPVActives(ArrayList<PVActive> actives) {
		this.actives = actives;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	protected ArrayList<PVActive> getPVActives(){
		return this.actives;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @param bkg
	 */
	protected void setPVBackground(PVBackground bkg){
		this.bkg = bkg;
	}
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return
	 */
	protected PVBackground getPVBackground(){
		return this.bkg;
	}

}
