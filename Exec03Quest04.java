package exercicios03;

import java.util.Scanner;

public class Exec03Quest04 {

	double nota01;
	double nota02;
	double nota03;
	double nota04;
	double totalNota;
	double media;
	
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Media das Notas");
		
		System.out.print("informe a primeira nota: ");
		double nota01 = scan.nextDouble();
		System.out.print("informe a segunda nota: ");
		double nota02 = scan.nextDouble();
		System.out.print("informe a terceira nota: ");
		double nota03 = scan.nextDouble();
		System.out.print("informe a quarta nota: ");
		double nota04 = scan.nextDouble();
		
		double totalNota = nota01 + nota02 + nota03 + nota04;
		double media = totalNota / 4;
		
		System.out.println("Total das Notas: " + String.format("%.2f", totalNota));
		System.out.println("Media das notas: " + String.format("%.2f", media));
		
		scan.close();
		
	}
	
}
