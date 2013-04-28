
public class Coordinate {
	public int x;
	public int y;
	
	public Coordinate(int h, int v){
		this.x=h;
		this.y=v;		
	}
	public Coordinate(Coordinate c){
		this.x=c.x;
		this.y=c.y;
	}
	public void setCoordinate(int h, int v){
		this.x=h;
		this.y=v;
	}
	public void setX(int h){
		this.x=h;
	}
	public void setY(int v){
		this.y=v;
	}
	public void move(int h, int v){
		this.x+=h;
		this.y+=v;
	}

}
