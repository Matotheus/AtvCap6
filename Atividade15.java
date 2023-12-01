import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] clientes = new String[8];
        int[] locacoes2011 = new int[8];
        int[] locacoesGratis = new int[8];

        System.out.println("Digite o nome de oito clientes e a quantidade de DVDs locados em 2011 para cada um:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nome do cliente " + (i + 1) + ": ");
            clientes[i] = input.nextLine();
            System.out.print("Quantidade de DVDs locados em 2011: ");
            locacoes2011[i] = input.nextInt();

            locacoesGratis[i] = locacoes2011[i] / 10;
            input.nextLine();

            System.out.println();
        }

        System.out.println("Relatorio de locações gratis");

        for (int i = 0; i < 8; i++) {
            System.out.println(clientes[i] + " tem direito a " + locacoesGratis[i] + " locações grátis.");
        }


        input.close();
    }
}
