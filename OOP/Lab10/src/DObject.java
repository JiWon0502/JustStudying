
public abstract class DObject {
	int width, height;
	double area;
	public DObject(int w, int h) {
		width = w;
		height = h;
	}
	public void computeArea() {
		area = width * height;
	}
	
	public abstract void show();
}
