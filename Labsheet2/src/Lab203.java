import java.text.DecimalFormat;

public class Lab203 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("####.000");
		DecimalFormat df2 = new DecimalFormat("#,###.0");
		int a = 1000;
		float b = 2010;
		double c = 145000;
		int d = 126;
		
		System.out.println("Number 1 = "+df.format(a));
		System.out.println("Number 2 = "+df.format(b));
		System.out.println("Number 3 = "+df2.format(c));
		System.out.println("Number 4 = "+d);

	}

}
