package src.iniciante;

import java.util.Scanner;

public class uri1175 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N[] = new int[20];
		
		for(int i = 0 ; i < N.length ; i++) {
			N[19-i] = sc.nextInt();
			}
		
		
		int i = 0;
		for(int j = 0; j < 20; j++) {
			System.out.println("N[" + i + "] = " + N[i]);
			i++;
		}
		sc.close();
	}
}
