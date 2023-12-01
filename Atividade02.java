import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int[] num = new int[7];

        System.out.println("Informe sete numeros inteiros:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Numero " +(i + 1)+ "º: ");
            num[i] = input.nextInt();
        }

        System.out.println("Numeros mutiplos de 2: ");
        for (int i = 0; i < 7; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

        System.out.println("Numeros mutiplos de 3: ");
        for (int i = 0; i < 7; i++) {
            if (num[i] % 3 == 0) {
                System.out.println(num[i]);
            }
        }

        System.out.println("Numeros mutiplos de 2 e 3: ");
        for (int i = 0; i < 7; i++) {
            if (num[i] % 2 == 0 && num[i] % 3 == 0) {
                System.out.println(num[i]);
            }
        }

        input.close();
    }
}
