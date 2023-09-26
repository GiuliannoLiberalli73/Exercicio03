package exercicios03;

import java.util.Scanner;

public class Exec03Quest16 {

    static int numDia;
    static int numMes;
    static String mes;
    static String trimestre;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Validando Data de Aniversario");
        System.out.println("\nInforme o dia do nascimento: ");
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
        scan.close();

        System.out.println("A data informada foi: " + numDia + "/" + numMes);

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

        if (mes == null) {
            System.out.println("Data invalida. Fim de Processo.");
        } else {
            System.out.println(
                    "A data e valida e o mes de nascimento e " + mes + ". Voce nasceu no " + trimestre + " Trimestre.");
        }

    }

}
