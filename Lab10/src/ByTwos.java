
public class ByTwos implements Series {
	int start;
	int val;
	
	public ByTwos() {
		start = 0;
		val = 0;
	}
	@Override
	public int getNext() {
		// TODO Auto-generated method stub
		val+=2;
		return val;
	}

	@Override
	public void reset() {
		start = 0;
		val = 0;
		// TODO Auto-generated method stub

	}

	@Override
	public void setStart(int x) {
		start = x;
		val = x;
		// TODO Auto-generated method stub

	}

}
