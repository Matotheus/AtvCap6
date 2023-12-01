import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] num = new int[5];
        int soma = 0;

        System.out.println("Informe 5 numeros inteiros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe " +(i + 1)+ " numero: ");
            num[i] = input.nextInt();
            soma += num[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(num[i]);
            if (num[i] < 5) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + soma);


        input.close();
    }
}
