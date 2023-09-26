package exercicios03;

import java.util.Scanner;

public class Exec03Quest08 {

    double numerador;
    double denominador;
    double racional;
  
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Transformando Numero Racional em Real");
        System.out.print("Informe o numerador: ");
        double numerador = scan.nextInt();
        System.out.print("Informe o denominador: ");
        double denominador = scan.nextInt();

        if (denominador == 0) {
            System.out.println("Denominador nao pode ser zero.");
            scan.close();
        } else {
            double racional = numerador / denominador;
            System.out.println("O valor Real obtido e " + String.format("%.3f", racional));
            scan.close();

        }

    }

}
