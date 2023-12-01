import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] num =new int[10];

        System.out.println("Informe 10 numeros inteiros");
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe " + (i + 1) + " numero: ");
            num[i] = input.nextInt();
        }

        int[] pares =new int[10];
        int[] impares =new int[10];

        int contPares = 0, contImpares = 0;

        for (int i = 0; i < 10; i++){
            if (num[i] % 2 == 0){
                pares[contPares++] = num[i];
            } else {
                impares[contImpares++] = num[i];
            }
        }

        System.out.println("Numeros pares: ");
        exibirVetor(pares, contPares);

        System.out.println("\n numeros impares");
        exibirVetor(impares, contImpares);


        input.close();
    }

    private static void exibirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " \n");
        }
        System.out.println();
    }
}
