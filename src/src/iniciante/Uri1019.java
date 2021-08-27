package src.iniciante;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int hora = 0;
		int minuto = 0;
				
		hora = (N / 60) / 60;
		N = N - (hora * 60 * 60);
		minuto = (N / 60);
		N = N - (minuto * 60);
		
		System.out.println(hora + ":" + minuto + ":" + N);
		sc.close();
	}
}
