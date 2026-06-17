import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, soma = 0;

        System.out.print("Digite um número inteiro positivo: ");
        n = scan.nextInt();

        for (int contador = 1; contador <= n; contador++) {
            if (contador % 3 == 0) {
                soma = soma + contador;
            }
        }

        System.out.println("A soma dos múltiplos de 3 entre 1 e " + n + " é: " + soma);

        scan.close();
    }
}