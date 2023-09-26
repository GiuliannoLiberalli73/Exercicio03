package exercicios03;

import java.util.Scanner;

public class Exec03Quest02 {
	
	double salAtual = 0.00;
	double minAtual = 0.00;
	double quantMin = 0.00;
	
	static public void calculo(double salAtual, double minAtual) {
		
		double quantMin = salAtual / minAtual;
		
		System.out.println("Seu salario equivale a " + String.format("%.2f", quantMin) + " salarios minimos.");
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de Salarios Minimos");
		
		System.out.print("Qual seu salario atual? ");
		double salAtual = scan.nextDouble();
		System.out.print("Qual o minimo atual? ");
		double minAtual = scan.nextDouble();
		
		calculo(salAtual, minAtual);
		
		scan.close();
		
	}

}
