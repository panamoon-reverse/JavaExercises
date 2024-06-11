import java.text.DecimalFormat;

public class Lab201 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		int a = 15;
		int b = 47;
		
		System.out.println("Summation of "+a+" and "+b+" is "+ (a+b));
		System.out.println("Subtraction of "+a+" and "+b+" is "+ (a-b));
		System.out.println("Multiplication of "+a+" and "+b+" is "+ (a*b));
		System.out.println("Division of "+a+" and "+b+" is "+ (df.format((float)a/b)));
	}
}
