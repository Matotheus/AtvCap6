import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] vendas = new double[10];
        double[] comissao = new double[10];
        double totalVendas = 0;
        double maiorComissao = 0;
        String nomeMaiorComissao = "";
        double menorComissao = Double.MAX_VALUE;
        String nomeMenorComissao = "";

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do vendedor " + (i + 1) + "º: ");
            nomes[i] = input.nextLine();
            System.out.print("Digite o total das vendas do vendedor " + (i + 1) + "º: ");
            vendas[i] = input.nextDouble();
            System.out.print("Digite o percentual de comissão do vendedor " + (i + 1) + "º: ");
            comissao[i] = input.nextDouble();
            input.nextLine();
        }



        System.out.println("\nRelatório de Comissões:");
        for (int i = 0; i < 10; i++) {
            double valorComissao = (vendas[i] * comissao[i] / 100);
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Valor a receber de comissão: R$ " + valorComissao);

            if (valorComissao > maiorComissao) {
                maiorComissao = valorComissao;
                nomeMaiorComissao = nomes[i];
            }
            if (valorComissao < menorComissao) {
                menorComissao = valorComissao;
                nomeMenorComissao = nomes[i];
            }

            totalVendas += vendas[i];
        }

        System.out.println("\nTotal das vendas de todos os vendedores: R$ " + totalVendas);
        System.out.println("Maior valor a receber: R$ " + maiorComissao + " (Vendedor: " + nomeMaiorComissao + ")");
        System.out.println("Menor valor a receber: R$ " + menorComissao + " (Vendedor: " + nomeMenorComissao + ")");

        input.close();
    }
}
