package exercicios03;

import java.util.Scanner;

public class Exec03Quest01 {

	int anoNasc;
	int anoAtual;
	int suaIdade;
	
	public static void main(String[] args) {
		
		Scanner exec03 = new Scanner(System.in);
		
		System.out.println("Descubra a sua Idade");
		
		System.out.print("Qual ano voce nasceu? ");
		int anoNasc = exec03.nextInt();
		System.out.print("Em que ano estamos? ");
		int anoAtual = exec03.nextInt();
		
		if (anoNasc > anoAtual) {

			System.out.println("Seu ano de nascimento nao pode ser maior do que o ano atual. Tente novamente.");
			exec03.close();
			return;
		
		}
		
		int suaIdade = anoAtual - anoNasc;
		
		System.out.println("Voce esta com " + suaIdade + " anos.");
		
		exec03.close();
				
		
	}
	
	
}
