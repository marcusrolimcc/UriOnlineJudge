package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int op1 = sc.nextInt();
		int op2 = sc.nextInt();
		
		double total = 0;
		
		if (op1 == 1) {
			total = total + 4; 
		}else if(op1 == 2) {
			total = total + 4.50;
		}else if(op1 == 3) {
			total = total + 5;
		}else if(op1 == 4){
			total = total + 2;
		}else if(op1 == 5) {
			total = total + 1.50;
		}
		
		total = total * op2;

		System.out.print(String.format("Total: R$ %.2f", total));
		System.out.println();
		
		sc.close();
	}
}
