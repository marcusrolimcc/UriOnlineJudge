package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] p1 = new String[1];
		String[] p2 = new String[1];
		
		p1 = sc.nextLine().split(" ");
		p2 = sc.nextLine().split(" ");
		
		double x1 = Double.parseDouble(p1[0]);
		double y1 = Double.parseDouble(p1[1]);
		
		double x2 = Double.parseDouble(p2[0]);
		double y2 = Double.parseDouble(p2[1]);
		
		double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		
		System.out.println(String.format("%.4f", distancia));	
		sc.close();
	}
}
