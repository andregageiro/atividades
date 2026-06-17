import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int numero, soma = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo");
        numero = scan.nextInt();

        for (int contador = 1; contador <= numero; contador++) {
            soma = soma + contador;
        }

        System.out.println("A soma é " + soma);

        scan.close();
    }
}