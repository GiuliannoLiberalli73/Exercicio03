package exercicios03;

import java.util.Scanner;

public class Exec03Quest14 {
    
    static String mes;
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o mes: ");
        String mes = scan.next();

        if (mes.equals("janeiro") | mes.equals("JANEIRO")){
            System.out.println("O numero do mes e " + 1);            
        } else if (mes.equals("fevereiro") | mes.equals("FEVEREIRO")) {
            System.out.println("O numero do mes e " + 2);
        } else if (mes.equals("marco") | mes.equals("MARCO")) {
            System.out.println("O numero do mes e " + 3);
        } else if (mes.equals("abril") | mes.equals("ABRIL")) {
            System.out.println("O numero do mes e " + 4);
        } else if (mes.equals("maio") | mes.equals("MAIO")) {
            System.out.println("O numero do mes e " + 5);
        } else if (mes.equals("junho") | mes.equals("JUNHO")) {
            System.out.println("O numero do mes e " + 6);
        } else if (mes.equals("julho") | mes.equals("JULHO")) {
            System.out.println("O numero do mes e " + 7);
        } else if (mes.equals("agosto") | mes.equals("AGOSTO")) {
            System.out.println("O numero do mes e " + 8);
        } else if (mes.equals("setembro") | mes.equals("SETEMBRO")) {
            System.out.println("O numero do mes e " + 9);
        } else if (mes.equals("outubro") | mes.equals("OUTUBRO")) {
            System.out.println("O numero do mes e " + 10);
        } else if (mes.equals("novembro") | mes.equals("NOVEMBRO")) {
            System.out.println("O numero do mes e " + 11);
        } else if (mes.equals("dezembro") | mes.equals("DEZEMBRO")) {
            System.out.println("O numero do mes e " + 12);
        } else {
            System.out.println("Informacao fornecida e invalida.");
        }
        scan.close();

    }

}
