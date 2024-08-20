
public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(3,4);
		t1.computeArea();
		t1.show();
		
		Rectangle r1 = new Rectangle(4,5);
		r1.computeArea();
		r1.show();
		
		ColorTriangle ct1 = new ColorTriangle(6,7,"red");
		ct1.computeArea();
		ct1.show();
		
		Rectangle2 r2 = new Rectangle2(7);
		r2.computeArea();
		r2.show();
		
		Rectangle r3 = new Rectangle(10,12);
		r3.computeArea();
		r3.show();
		
		DObject ob[] = new DObject[5];
		ob[0] = t1;
		ob[1] = r1;
		ob[2] = ct1;
		ob[3] = r2;
		ob[4] = r3;
		
		System.out.println("-------------------------------------");
		System.out.println("Triangle만 출력");
		for(int i = 0; i<ob.length; i++) {
			if(ob[i] instanceof Triangle && !(ob[i] instanceof ColorTriangle)) ob[i].show();
		}
	}
}
