import java.util.Scanner;

public class Lab214 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number in variable 'A' : ");
		int a = scan.nextInt();
		System.out.print("Input number in variable 'B' : ");
		int b = scan.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("---------------------------------");
		System.out.println("After swap two number!!");
		System.out.println("---------------------------------");
		System.out.println("The number in variable 'A' is "+a);
		System.out.println("The number in variable 'B' is "+b);
	}

}
