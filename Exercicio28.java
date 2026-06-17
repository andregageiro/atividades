import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int menor = scan.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scan.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O menor número digitado foi: " + menor);

        scan.close();
    }
}