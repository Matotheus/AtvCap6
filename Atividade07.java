import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        double[] numeros = new double[10];
        int quantidadeNegativo = 0;
        double somaPositivos = 0;

        System.out.println("Informe 10 numeros reais: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe " +(i + 1)+ " numero: ");
            numeros[i] = input.nextDouble();
        }

        for (int i = 0; i < 10; i ++) {
            if (numeros[i] < 0) {
                quantidadeNegativo++;
            } else {
                somaPositivos += numeros[i];
            }
        }

        System.out.println("Quantidade de numeros negativos: " +quantidadeNegativo);
        System.out.println("A soma dos numeros positivos: " +somaPositivos);


        input.close();
    }
}
