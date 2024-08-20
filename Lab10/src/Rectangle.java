
public class Rectangle extends DObject {

	public Rectangle(int w, int h) {
		super(w, h);
	}
	public void computeArea() {
		area = width*height;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("Rectangle: ");
		System.out.println(width + " "+ height+" "+ area);
	}


}
