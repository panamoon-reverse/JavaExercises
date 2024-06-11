import java.util.Scanner;

public class Lab309 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input time (minute) : ");
		int min = scan.nextInt();
		
		System.out.println("---------------------------");
		int h = min/60;
		int m = min%60;
		
		System.out.println("Time = "+h+" hour "+m+" minute");
		
		String res="";
		float fee = 0;
		
		if(m >= 15) {
			h += 1;
			m = 0;
			System.out.println("New = "+h+" hour "+m+" minute");
		}
		
		if(h<3) {
			res = "Park Free!";
		}
		
		if(h==3) {
			if(m>=1){
				fee = m*0.5f;
				res = "Amount to be paid "+fee+" baht.";
			}
			else {
				res = "Park Free!";
			}
		}
			
		if(h>3) {
			h = h-3;
			fee = h*40+(0.5f*m);
			res = "Amount to be paid "+fee+" baht.";
		}
		
		System.out.println("---------------------------");
		System.out.println(res);
		
		

	}

}
