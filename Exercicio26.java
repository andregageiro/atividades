import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;
        int contador;
        contador = 0;
        for (int i = 1; i <=10; i++){
            System.out.println("digite a nota do aluno ");
            nota = scan.nextDouble();
            if (nota >= 6)
                contador = contador + 1;

        }
        System.out.println("quantidade de alunos aprovados " + contador);





















    }
}
