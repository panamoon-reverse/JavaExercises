import java.util.Scanner;

public class Example302 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input number 1 : ");
		int a = scan.nextInt();
		System.out.print("Input number 2 : ");
		int b = scan.nextInt();
		System.out.println();
		
		/*
		if(a==b) {
			System.out.println("Both of number are equal.");
		}
		else {
			System.out.println("Both of number are NOT equal.");
			
		}
		*/
		
		String res = (a==b) ?"Both of number are equal.":"Both of number are NOT equal.";
		
		System.out.print(res);
	}

}
