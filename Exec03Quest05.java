package exercicios03;

import java.util.Scanner;

public class Exec03Quest05 {

    double vlrDiv, percJuros, jurosMes, vlrFim;
    int meses;

    static public void calculo(double vlrDiv, double percJuros, int meses) {

        double vlrFim = vlrDiv + (vlrDiv * (percJuros / 100) * meses);

        System.out.println("O valor final da divida e R$ " + String.format("%.2f", vlrFim));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Descubra o Valor da Sua Divida");

        System.out.print("Informe o valor do debito: ");
        double vlrDiv = scan.nextDouble();
        System.out.print("Informe o percentual de juros: ");
        double percJuros = scan.nextDouble();
        System.out.print("Informe a quantidade de meses: ");
        int meses = scan.nextInt();

        calculo(vlrDiv, percJuros, meses);

        scan.close();

    }

}
