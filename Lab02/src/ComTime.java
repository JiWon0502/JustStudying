
public class ComTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double light_speed = 30e4;
		double distance = 40e12;
		
		double time;
		
		time = distance/light_speed;
		
		double light_year = time / (60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 "+ light_year + "광년!");
	}

}
