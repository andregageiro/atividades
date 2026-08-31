import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma;
        soma = 0;
        numero = 1;

        while (numero != 0) {
            System.out.println("digite um numero");
            numero = scan.nextInt();
            soma = soma + numero;
        }
        System.out.println("a soma dos numeros é " + soma);


















    }
}
