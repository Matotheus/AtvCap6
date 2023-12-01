import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        int[] codigoProduto = new int[10];
        int[] estoqueProduto = new int[10];
        int codigoProdutoDesejado, qtdProdutoDesejado, indiceProduto;

        for (int i = 0; i < 10; i++) {
            
            System.out.print("Informe o " +(i +i)+ "codigo do produto: ");
            codigoProduto[i] = input.nextInt();
            System.out.print("Informe o estoque do produto de codigo(" +codigoProduto[i]+ "):");
            estoqueProduto[i] = input.nextInt();

        }

        while (true) {
            System.out.print("Informe o código do cliente (0 para encerrar): ");
            int codigoCliente = input.nextInt();

            if (codigoCliente == 0) {
                break;
            }

            System.out.print("Informe o código do produto desejado: ");
             codigoProdutoDesejado = input.nextInt();
            System.out.print("Informe a quantidade desejada: ");
            qtdProdutoDesejado = input.nextInt();

             indiceProduto = -1;

            for (int i = 0; i < 10; i++) {
                if (codigoProduto[i] == codigoProdutoDesejado) {
                    indiceProduto = i;
                    break;
                }
            }

            if (indiceProduto == -1) {
                System.out.println("Código inexistente.");
            } else {
                if (estoqueProduto[indiceProduto] >= qtdProdutoDesejado) {
                    estoqueProduto[indiceProduto] -= qtdProdutoDesejado;
                    System.out.println("Pedido atendido. Obrigado e volte sempre.");
                } else {
                    System.out.println("Não temos estoque suficiente dessa mercadoria.");
                }
            }
        }

        System.out.println("Estoque atualizado:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Código: " + codigoProduto[i] + ", Estoque: " + estoqueProduto[i]);
        }

        input.close();

    }
}
