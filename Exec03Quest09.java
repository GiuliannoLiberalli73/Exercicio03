package exercicios03;

import java.util.Scanner;
import java.time.LocalDate;

public class Exec03Quest09 {
    
    int anoAtual;
    int anoNasc;

    static public void main (String[] args){

        Scanner scan = new Scanner(System.in);

        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear(); 

        System.out.println("Voce e maior de idade ou nao?");
        System.out.print("Informe o ano em que nasceu: ");
        int anoNasc = scan.nextInt();
        int maiorIdade = anoAtual - anoNasc;

        if (maiorIdade >= 18){
            System.out.println("Sim, voce tem " + maiorIdade + ". E de maior.");
        } else {
            System.out.println("Nao, voce tem " + maiorIdade + ". Ainda e de menor.");
        }
        scan.close();
    }

}
