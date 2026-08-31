import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma, media;
        System.out.println("digite um numero");
        numero = scan.nextInt();
        System.out.println("digite o segundo numero");
        numero = scan.nextInt();
        System.out.println("digite o terceiro numero");
        numero = scan.nextInt();
        System.out.println("digite o quarto numero");
        numero = scan.nextInt();
        System.out.println("digite o quinto numero");
        numero = scan.nextInt();
        media = numero /5;
        soma = numero +1;
        System.out.println("a soma é " + soma);
        System.out.println("a media é " + media);


    }
}
