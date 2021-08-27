package src.iniciante;

import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		
		int num;
		int ano;
		int mes;
		int dia;
			
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		ano = (num / 365);
		mes = (num - (ano * 365)) / 30 ; 		
		dia = ((num - (ano * 365)) % 30) ; 
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	
		sc.close();
	}
}
