import java.util.Scanner;

public class Lab310 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input year : ");
		int year = scan.nextInt();
		String res;
		
		System.out.println();
		
		if(year%4==0 && year%100!=0) {
			res = "";
		}
		else if(year%100==0 && year%400==0) {
			res = "";
		}
		else {
			res = " not";
		}
		
		System.out.println(year+" is"+res+" Leap year.");

	}

}
