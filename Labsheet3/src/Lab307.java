import java.util.Scanner;

public class Lab307 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number : ");
		int num = scan.nextInt();
		
		System.out.println();
		
		String res1,res2;
		
		if(num>0) {
			res1 = "Positive";
		}
		else if (num < 0) {
			res1 = "Negative";
		}
		else {
			res1 = "Zero";
		}
		
		res2 = (num%2==0)? "Even":"Odd";
		System.out.println(num+" is "+res1+" and "+res2+" number.");

	}

}
