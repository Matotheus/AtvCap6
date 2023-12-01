import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int tam = 5, res = 0;
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];

        System.out.println("Insira 5 valores para o vetor A");
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o " +(i + 1)+ "º numero: ");
            vetorA[i] = input.nextInt();
        }

        System.out.println("Insira 5 valores para o vetor B");
        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o " +(i + 1)+ "º numero: ");
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            res += vetorA[i] - vetorB[4 - i];
        }

        System.out.println("O resultado das subtrações é: " +res);
        input.close();
    }
}
