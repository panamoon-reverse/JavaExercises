import java.util.Scanner;

public class Lab305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input number 1 : ");
		int a = scan.nextInt();
		System.out.print("Input number 2 : ");
		int b = scan.nextInt();
		
		System.out.println();
		
		String res;
		if(a>b) {
			res = "greater than";
		}
		else if (a < b) {
			res = "less than";
		}
		else {
			res = "equal to";
		}
		System.out.println("The first number ("+a+") is " + res +" Secound number ("+b+") ");
	}

}
