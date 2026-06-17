import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        n2 = scan.nextDouble();

        System.out.println("Digite o terceiro número:");
        n3 = scan.nextDouble();

        if ((n1 >= n2) && (n1 >= n3)) {
            System.out.println("O maior número é " + n1);

        } else if ((n2 >= n1) && (n2 >= n3)) {
            System.out.println("O maior número é " + n2);

        } else {
            System.out.println("O maior número é " + n3);
        }

        scan.close();
    }
}