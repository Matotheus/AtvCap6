import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] produtos = new String[5];
        double[] precoProduto = new double[5];
        int produtosInferior50 = 0;
        String produtosEntre50e100 = "";
        double somaPrecosSuperior100 = 0;
        int countPrecosSuperiores100 = 0;

        System.out.println("Informe o nome e o preço de cinco produtos:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            produtos[i] = input.nextLine();
            System.out.print("Preço do produto " + produtos[i] + ": R$");
            precoProduto[i] = input.nextDouble();
            input.nextLine();


            if (precoProduto[i] < 50.0) {
                produtosInferior50++;

            } else if (precoProduto[i] >= 50.0 && precoProduto[i] <= 100.0) {
                if (!produtosEntre50e100.isEmpty()) {
                    produtosEntre50e100 += ", ";
                }

                produtosEntre50e100 += produtos[i];

            } else if (precoProduto[i] > 100.0) {
                somaPrecosSuperior100 += precoProduto[i];
                countPrecosSuperiores100++;

            }

        }

        System.out.println("Quantidade de produtos com preço inferior a R$ 50,00: " + produtosInferior50);
        System.out.println("Produtos com preço entre R$ 50,00 e R$ 100,00: " + produtosEntre50e100);

        if (countPrecosSuperiores100 > 0) {
            double mediaPrecosSuperiores100 = somaPrecosSuperior100 / countPrecosSuperiores100;
            System.out.println("Média dos preços dos produtos com preço superior a R$ 100,00: R$" + mediaPrecosSuperiores100);

        } else {
            System.out.println("Não há produtos com preço superior a R$ 100,00.");

        }



        input.close();
    }
}
