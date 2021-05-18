
public class Rectangle2 extends DObject {

	public Rectangle2(int w) {
		super(w, w);
	}
	public void computeArea() {
		area = width*height;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("Rectangle2: ");
		System.out.println(width + " "+ height+" "+ area);
	}

}
