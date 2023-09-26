package exercicios03;

import java.util.Scanner;

public class Exec03Quest13 {

    static double nota01, nota02, nota03, nota04, totNotas, media;
    static int conf;
    static public String resp = "";
    
    static public void recupera (double totNotas) {

    		Scanner scan = new Scanner(System.in);
        
           		System.out.print("Aluno fez prova de recuperacao. (S/N) ");
           		resp = scan.next();
           		if (resp.equals("S")) {
    		    System.out.print("Informe a quarta nota: ");
        		double nota04 = scan.nextDouble();
        		media = (totNotas+nota04) / 4;
        			if(media >= 5.0) {
        				System.out.println("Atualizacao: Aprovado");
        			} else {
        				System.out.println("Atualizacao: Ainda em Recuperacao");
        			}
           		} else {
           			System.out.println("Aluno nao fez prova. Continua em recuperacao.");
           		}
           	scan.close();
    }

  
    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Resultado do Aluno");
        System.out.print("Informe a primeira nota: ");
        double nota01 = scan.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota02 = scan.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota03 = scan.nextDouble();

        double totNotas = nota01 + nota02 + nota03;
        double media = totNotas / 3;

        if (media >= 7.00) {
            System.out.println("Media " + String.format("%.2f", media) + ". Resultado: Aprovado.");
        } else if (media >= 5.00 && media < 7.00) {
            System.out.println("Media " + String.format("%.2f", media) + ". Resultado: Recuperacao.");
            recupera(totNotas);
        } else if (media < 5.00) {
            System.out.println("Media " + String.format("%.2f", media) + ". Resultado: Reprovado.");
        }
        scan.close();
    }

}
