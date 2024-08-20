
public class Point {
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "p("+x+","+y+")";
	}
	public boolean equals(Point p) {
		if((x/(double)y)==(p.x / (double)p.y)) {
			return true;
		}
		else return false;
	}
}
