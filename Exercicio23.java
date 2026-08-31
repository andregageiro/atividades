import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double idade, soma, media;
        soma = 0;
        for (double i = 1; i <= 8; i++){
            System.out.println("digite a idade do aluno");
            idade = scan.nextDouble();
            soma = soma + idade;
        }
        media = soma / 8;
        System.out.println("soma das idades " + soma);
        System.out.println("media da turma " + media);







                                                                           












    }
}
