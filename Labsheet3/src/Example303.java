import java.util.Scanner;

public class Example303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String res;
		
		System.out.print("Input a number : ");
		int num = scan.nextInt();
		
		if(num>0) {
			res = "positive";
		}
		else if (num<0) {
			res = "negative";
		}
		else {
			res = "zero";
		}
		
		System.out.println();
		System.out.println(num+" is "+res+" number.");

	}

}
