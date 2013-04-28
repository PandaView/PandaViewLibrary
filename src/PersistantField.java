
public abstract class PersistantField implements Active {

	private Coordinate center;
	private int radius;
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
