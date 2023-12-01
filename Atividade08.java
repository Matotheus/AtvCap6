import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] nome = new String[7];
        double[] medias = new double[7];

        double maiorMedia = 0, notaNecessaria;
        int indiceMaiorMedia = 0;


        System.out.println("Informe o nome do aluno");
        System.out.println("Informe a media do aluno");
        for (int i = 0; i < 7; i ++) {
            System.out.println("Informe o " +(i + 1) +"º nome: ");
            nome[i] = input.nextLine();
            
            System.out.println("Informe a " +(i + 1) +"º media: ");
            medias[i] = input.nextDouble();
            input.nextLine();
        }

        for (int i = 1; i < 7; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                indiceMaiorMedia = i;
            }
        }

        System.out.println("Aluno com a maior média: " + nome[indiceMaiorMedia]);

        for (int i = 0; i < 7; i++) {
            if (medias[i] < 7) {
                notaNecessaria = 5 - medias[i];
                System.out.println(nome[i] + " precisa tirar " + notaNecessaria + " no exame final para ser aprovado.");
            }
        }


        input.close();
    }
}
