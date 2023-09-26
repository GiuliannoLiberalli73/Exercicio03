package exercicios03;

import java.util.Scanner;

public class Exec03Quest11 {

    static int idade;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Obrigatoriedade do Voto");
        System.out.print("Informe a sua idade: ");
        int idade = scan.nextInt();

        if (idade < 16) {
            System.out.println("Ainda nao tem idade para votar.");
        } else if (idade >= 16 && idade <= 65) {
            System.out.println("Voto e obrigatorio para a sua idade.");
        } else if (idade >= 66) {
            System.out.println("Voto facultativo.");
        }
        System.out.println(idade);
        scan.close();
    }
}
