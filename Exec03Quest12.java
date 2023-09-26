package exercicios03;

import java.util.Scanner;

public class Exec03Quest12 {

    static double nota01, nota02, nota03, totNotas, media;

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
        } else if (media < 5.00) {
            System.out.println("Media " + String.format("%.2f", media) + ". Resultado: Reprovado.");
        }
        scan.close();
    }

}
