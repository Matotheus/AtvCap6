import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int[] num = new int[6];
        int pares = 0;
        int impares = 0;


        for (int i = 0; i < num.length; i++) {
            System.out.print("Informe um numero " +(i + 1)+ "º:");
            num[i] = input.nextInt();

            if (num[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

        }

        System.out.println("Numero pares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

        System.out.println("Quantidade de numero pares: " +pares);

        System.out.println("Numero impares: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }

        System.out.println("Quantidade de numeros impares: " +impares);

    input.close();
    }
}
