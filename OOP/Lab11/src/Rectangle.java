
public class Rectangle {
	int width, height;
	String style;
	public Rectangle(int w, int h, String s) {
		width = w;
		height = h;
		style = s;
	}
	
	public String toString() {
		return "(" + style+")"+"가로= "+width+", 세로= "+ height;
	}
}
