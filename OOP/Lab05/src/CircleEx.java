
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적: "+area);
		
		Circle donut = new Circle();
		donut.name ="도넛피자";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적: "+area);
	}

}
