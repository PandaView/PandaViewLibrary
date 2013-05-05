
import javax.swing.JFrame;


/**
 * 
 *
 * @author John.
 *         Created Apr 15, 2013.
 */
public abstract class Existance extends JFrame {
	
	//private ArrayList<Active> actives;
	//private PVBackground bkg;
	
	public Existance(String appName){
		super(appName);
				
	}

	protected abstract void setActives();

	protected abstract void setPVBackground();
	
	

}
