import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeAlunos;
        int aprovados = 0;
        double nota;
        double soma = 0;
        double media;

        System.out.print("Digite a quantidade de alunos: ");
        quantidadeAlunos = scan.nextInt();

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = scan.nextDouble();

            soma += nota;

            if (nota >= 7) {
                aprovados++;
            }
        }

        media = soma / quantidadeAlunos;

        System.out.println("Média da turma: " + media);
        System.out.println("Alunos com nota maior ou igual a 7: " + aprovados);

        scan.close();
    }
}