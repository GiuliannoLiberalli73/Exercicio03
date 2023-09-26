package exercicios03;

import java.util.Scanner;

public class Exec03Quest07 {

    double conta;
    double comissao;

    static public void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Comissao do Garcom");

        System.out.print("Valor da conta do cliente? ");
        double conta = scan.nextDouble();

        double comissao = (conta * 10)/100;

        System.out.print("O valor da comissao e R$ " + String.format("%.2f", comissao));

        scan.close();

    }
    
}
