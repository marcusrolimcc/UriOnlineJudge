package src.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] pontos = new String[3];
		pontos = sc.nextLine().split(" ");
		
		double pi = 3.14159;
		
		double A = Double.parseDouble(pontos[0]);
		double B = Double.parseDouble(pontos[1]);
		double C = Double.parseDouble(pontos[2]);
		
		double TRIANGULO = (A * C) / 2;
		//Area = pi * R^2
		double CIRCULO = pi * Math.pow(C, 2);
		//Area = ((B+b)*h)/2
		double TRAPEZIO =  (( A + B ) * C) / 2;
		//Area = L^2
		double QUADRADO = Math.pow(B, 2);
		//Area = b * h
		double RETANGULO = A * B;
		
		System.out.println("TRIANGULO: " + String.format("%.3f", TRIANGULO));
		System.out.println("CIRCULO: " + String.format("%.3f", CIRCULO));
		System.out.println("TRAPEZIO: " + String.format("%.3f", TRAPEZIO));
		System.out.println("QUADRADO: " + String.format("%.3f", QUADRADO));
		System.out.println("RETANGULO: " + String.format("%.3f", RETANGULO));
		sc.close();
	}
}
