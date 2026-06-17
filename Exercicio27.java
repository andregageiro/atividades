import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maior = 0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if (contador == 1) {
                maior = numero;
            } else if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        scan.close();
    }
}