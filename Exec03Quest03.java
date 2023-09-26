package exercicios03;

import java.util.Scanner;

public class Exec03Quest03 {

	int homem;
	int mulher;
	int total;
	double percHomem;
	double percMulher;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Percentual de Homens e Mulheres");
		
		System.out.print("Informe a quantidade de homens: ");
		int homem = scan.nextInt();
		System.out.print("Informe a quantidade de mulheres: ");
		int mulher = scan.nextInt();
		
		int total = homem + mulher;
		
		System.out.println("Total de pessoas da turma: " + total);
		
		scan.close();
		
		double percHomem = (double) ((homem*100)/total);
		double percMulher = (double) ((mulher*100)/total);
		
		System.out.println("Percentual de Homens na turma: " + String.format("%.2f", percHomem) + "%");
		System.out.println("Percentual de Mulheres na turma: " + String.format("%.2f", percMulher) + "%");
		
	}

}
