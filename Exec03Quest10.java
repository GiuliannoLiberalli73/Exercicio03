package exercicios03;

import java.util.Scanner;

public class Exec03Quest10 {

    double salBruto, descFgts, descTransp, salReceb, vlrEmpr, totDesc;
    static double descInss, calcEmpr;

    static public void emprestimo(double salReceb, double vlrEmpr) {
        calcEmpr = (salReceb * 30) / 100;
        if (vlrEmpr > calcEmpr) {
            System.out.println("O valor de R$ " + vlrEmpr + " esta acima de 30% do salario a receber. Emprestimo negado.");
        } else {
            System.out.println("O emprestimo pode ser feito.");
        }
    }

    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Solicitacao de Emprestimo");
        System.out.println("Qual o valor do emprestimo solicitado? ");
        double vlrEmpr = scan.nextDouble();
        System.out.print("Informe o Salario Bruto: ");
        double salBruto = scan.nextDouble();

        double descFgts = (salBruto * 8) / 100;
        double descTransp = (salBruto * 6) / 100;

        if (salBruto <= 1320) {
            descInss = (salBruto * 7.5) / 100;
        } else if (salBruto > 1320 && salBruto <= 2571.29) {
            descInss = (salBruto * 9) / 100;
        } else if (salBruto > 2571.29 && salBruto <= 3856.94) {
            descInss = (salBruto * 12) / 100;
        } else if (salBruto > 3856.94) {
            descInss = (salBruto * 14) / 100;
        }

        double totDesc = descFgts + descTransp + descInss;
        double salReceb = salBruto - totDesc;
        System.out.println("Descontos: ");
        System.out.println("FGTS: " + String.format("%.2f", descFgts));
        System.out.println("Transporte: " + String.format("%.2f", descTransp));
        System.out.println("INSS: " + String.format("%.2f", descInss));
        System.out.println("O Salario a receber e de R$ " + String.format("%.2f", salReceb));

        emprestimo(salReceb, vlrEmpr);

        scan.close();

    }

}
