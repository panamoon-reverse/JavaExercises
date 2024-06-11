import java.util.Scanner;

public class Example301 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number : ");
		int num = scan.nextInt();
		
		System.out.println();
		if(num>0) {
			System.out.println("This is positive number.");
		}
		
		System.out.println("You input number = "+num);
	}

}
