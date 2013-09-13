package PVLib;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		
		this.container = getContentPane();
		this.container.setLayout( null );
		this.endPoint = new PVCoordinate();
		this.bkg = createPVBackground();
		this.actives = createPVActives();
		
		
		addGraphicals();
		addBg();

		setLocationRelativeTo(null);
		pack();
		setVisible(true);
		
		repaint();


	}

	private void addBg() {
		this.container.add( this.bkg );
	}

	/**
	 * TODO Put here a description of what this method does.
	 *
	 */
	private void addGraphicals() {
		if (this.actives!=null && this.actives.size()>0){
			for (int i=0;i<this.actives.size();i++){
				PVActive temp = this.actives.get(i);
				if (temp.isGraphical()){
					this.container.add((PVGraphical) temp);
				}
			}
		}
				
	}
	private GridBagConstraints getGBConstraints(PVActive temp) {
		// TODO Auto-generated method stub
		GridBagConstraints cts = new GridBagConstraints();
		
		cts.gridx = 0;
		cts.gridy = 0;
		
		return cts;
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
		super.setSize(x,y);
		this.endPoint.setX(x);
		this.endPoint.setY(y);
		super.setLocationRelativeTo(null);
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
	@Override
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
