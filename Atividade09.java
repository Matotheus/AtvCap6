import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] nomeProduto = new String[10];
        int[] codigoProduto = new int[10];
        double[] precoProduto = new double[10];

        double novoPreco = 0;
        int i;

        for (i  = 0; i < 10; i++) {
            System.out.print("Informe o nome do produto: ");
            nomeProduto[i] = input.nextLine();
            System.out.print("Informe codigo do produto: ");
            codigoProduto[i] = input.nextInt();
            System.out.print("Informe o preço: R$");
            precoProduto[i] = input.nextDouble();
            input.nextLine();

        }

        for ( i = 0; i < 10; i++) {
             novoPreco = precoProduto[i];

            if (codigoProduto[i] % 2 == 0) {
                novoPreco *= 1.20;
            }

            if (precoProduto[i] > 1000) {
                novoPreco *= 1.10;
            }

            if (codigoProduto[i] % 2 != 0 && precoProduto[i] <= 1000) {
                novoPreco *= 1.15;
            }

            if (novoPreco != precoProduto[i]) {
                System.out.println(nomeProduto[i] + "\t" + codigoProduto[i] + "\t" + precoProduto[i] + "\t" + novoPreco);
            }
        }

        input.close();
    }
}
