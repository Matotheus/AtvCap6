import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        String[] alunos = new String[8];
        double[] notas = new double[8];
        double somaNotas = 0,  mediaSala;

        System.out.println("Informe o nome e a nota de 8 alunos: ");

        for (int i = 0; i < 8; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            alunos[i] = input.next();
            System.out.print("Informe a nota do " + alunos[i] + ": ");
            notas[i] = input.nextDouble();

            somaNotas += notas[i];
        }

        System.out.println();

        System.out.println("Relatorio das notas: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(alunos[i] + " " + notas[i]);
        }

        mediaSala = somaNotas / 8;

        System.out.printf("A media da sala e: %.2f" ,mediaSala);

        input.close();
    }
}