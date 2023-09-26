package exercicios03;

import java.util.Scanner;
import java.time.LocalDate;

public class Exec03Quest18 {

    static int numDia;
    static int numMes;
    static int numAno;
    static int anoAtual;
    static String mes;
    static String trimestre;
    static String signo = "";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Validando Data de Aniversario");
        System.out.print("\nInforme o dia do nascimento: ");
        int numDia = scan.nextInt();
        System.out.print("Informe o mes de nascimento: ");
        int numMes = scan.nextInt();
        if (numDia <= 0 || numDia >= 32) {
            System.out.println("Dia informado e invalido.");
            scan.close();
            return;
        }
        if (numMes <= 0 || numMes >= 13) {
            System.out.println("Mes informado e invalido.");
            scan.close();
            return;
        }
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        System.out.print("Informe o ano de nascimento: ");
        int numAno = scan.nextInt();
        int suaIdade = anoAtual - numAno;
        scan.close();

        System.out.println("A data informada foi: " + numDia + "/" + numMes + "/" + numAno);

        if (numMes == 1) {
            mes = "Janeiro";
        } else if (numMes == 3) {
            mes = "Marco";
        } else if (numMes == 5) {
            mes = "Maio";
        } else if (numMes == 7) {
            mes = "Julho";
        } else if (numMes == 8) {
            mes = "Agosto";
        } else if (numMes == 10) {
            mes = "Outubro";
        } else if (numMes == 12) {
            mes = "Dezembro";
        }

        if (numMes == 2) {
            if (numDia <= 28) {
                mes = "Fevereiro";
            } else {
                System.out.println("Atencao. Fevereiro tem somente 28 dias.");
            }
        }

        if (numMes == 4) {
            if (numDia <= 30) {
                mes = "Abril";
            } else {
                System.out.println("Atencao. Abril tem somente 30 dias.");
            }
        }

        if (numMes == 6) {
            if (numDia <= 30) {
                mes = "Junho";
            } else {
                System.out.println("Atencao. Junho tem somente 30 dias.");
            }
        }

        if (numMes == 9) {
            if (numDia <= 30) {
                mes = "Setembro";
            } else {
                System.out.println("Atencao. Setembro tem somente 30 dias.");
            }
        }

        if (numMes == 11) {
            if (numDia <= 30) {
                mes = "Novembro";
            } else {
                System.out.println("Atencao. Novembro tem somente 30 dias.");
            }
        }

        if (numMes >= 1 && numMes <= 3) {
            trimestre = "Primeiro";
        } else if (numMes >= 4 && numMes <= 6) {
            trimestre = "Segundo";
        } else if (numMes >= 7 && numMes <= 9) {
            trimestre = "Terceiro";
        } else if (numMes >= 10 && numMes <= 12) {
            trimestre = "Quarto";
        }

        if ((((numMes == 3) & (numDia >= 21) & (numDia <= 31))) | ((numMes == 4) & (numDia >= 1) & (numDia <= 20))) {
            signo = "Aries";
        } else if ((((numMes == 4) & (numDia >= 21) & (numDia <= 30)))
                | ((numMes == 5) & (numDia >= 1) & (numDia <= 20))) {
            signo = "Touro";
        } else if ((((numMes == 5) & (numDia >= 21) & (numDia <= 31)))
                | ((numMes == 6) & (numDia >= 1) & (numDia <= 20))) {
            signo = "Gemeos";
        } else if ((((numMes == 6) & (numDia >= 21) & (numDia <= 30)))
                | ((numMes == 7) & (numDia >= 1) & (numDia <= 22))) {
            signo = "Cancer";
        } else if ((((numMes == 7) & (numDia >= 23) & (numDia <= 31)))
                | ((numMes == 8) & (numDia >= 1) & (numDia <= 22))) {
            signo = "Leao";
        } else if ((((numMes == 8) & (numDia >= 23) & (numDia <= 31)))
                | ((numMes == 9) & (numDia >= 1) & (numDia <= 22))) {
            signo = "Virgem";
        } else if ((((numMes == 9) & (numDia >= 23) & (numDia <= 30)))
                | ((numMes == 10) & (numDia >= 1) & (numDia <= 22))) {
            signo = "Libra";
        } else if ((((numMes == 10) & (numDia >= 23) & (numDia <= 31)))
                | ((numMes == 11) & (numDia >= 1) & (numDia <= 21))) {
            signo = "Escorpiao";
        } else if ((((numMes == 11) & (numDia >= 22) & (numDia <= 30)))
                | ((numMes == 12) & (numDia >= 1) & (numDia <= 21))) {
            signo = "Sagitario";
        } else if ((((numMes == 12) & (numDia >= 22) & (numDia <= 31)))
                | ((numMes == 1) & (numDia >= 1) & (numDia <= 20))) {
            signo = "Capricornio";
        } else if ((((numMes == 1) & (numDia >= 21) & (numDia <= 31)))
                | ((numMes == 2) & (numDia >= 1) & (numDia <= 18))) {
            signo = "Aquario";
        } else if ((((numMes == 2) & (numDia >= 19) & (numDia <= 28)))
                | ((numMes == 3) & (numDia >= 1) & (numDia <= 20))) {
            signo = "Peixes";
        }

        if (mes == null) {
            System.out.println("Data invalida. Fim de Processo.");
        } else {
            System.out.println(
                    "A data e valida e o mes de nascimento e " + mes + ". Voce nasceu no " + trimestre + " Trimestre.");
            System.out.println("Voce esta com " + suaIdade + " anos. Seu signo e " + signo + ".");
        }

    }

}
