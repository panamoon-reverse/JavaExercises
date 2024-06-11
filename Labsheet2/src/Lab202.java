import java.text.DecimalFormat;

public class Lab202 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		int a = 252;
		int b = 147;
		int c = 368;
		float sum = a+b+c;
		float avg = sum/3;
		
		System.out.println("Number 1 : "+a);
		System.out.println("Number 2 : "+b);
		System.out.println("Number 3 : "+c);
		System.out.println("Summary of "+a+", "+b+" and "+c+" is "+df.format(sum));
		System.out.println("Average is "+df.format(avg));
	}

}
