import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números pares: " + contador);

        scan.close();
    }
}
