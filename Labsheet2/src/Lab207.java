import java.text.DecimalFormat;

public class Lab207 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00");
		int min = 378;
		int h = min/60;
		int m = min%60;
		
		System.out.println("All minute is "+min);
		System.out.println("-------------------------------");
		System.out.println("Time is "+df.format(h)+" hour "+df.format(m)+" minute");
		System.out.println("-------------------------------");
	}

}
