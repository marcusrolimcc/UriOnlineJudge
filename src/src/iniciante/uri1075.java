package src.iniciante;

import java.util.Scanner;

public class uri1075 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double restoDivisao;
		int resto[] = new int[10000];

		int j = 0;
		for(int i = 1 ; i <= 10000 ; i++) {
			restoDivisao = i % numero;
			if(restoDivisao == 2) {
			resto[j] = i;
			j++;
			}
		}
		for(int i = 0 ; i <= resto[i] ; i++) {
			System.out.println(resto[i]);
		}
	
	sc.close();
	}
}
