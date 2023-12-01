import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        int[] matriculasLogica = new int[15];
        int[] matriculasLinguagem = new int[10];

        System.out.println("Informe as matriculas dos alunos que cursam logica:");
        for (int i = 0; i < 15; i++) {
            var input = new Scanner(System.in);
            System.out.print("Matricula de logica numero " +(i + 1)+ "º: ");
            matriculasLogica[i] = input.nextInt();
        }

        System.out.println("Informe as matriculas dos alunos que cursam linguagem de programação:");
        for (int i = 0; i < 10; i++) {
            var input = new Scanner(System.in);
            System.out.print("Matricula de linguagem de programação " +(i + 1)+ "º: ");
            matriculasLinguagem[i] = input.nextInt();
        }

        System.out.println("Matriculas que estao em ambos os vetores: ");
        for (int matriculaLogica : matriculasLogica) {
            for (int matriculaLinguagem : matriculasLinguagem) {
                if (matriculaLogica == matriculaLinguagem) {
                    System.out.println(matriculaLogica);
                }
            }
        }
    }
}
