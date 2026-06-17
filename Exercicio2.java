import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int n1 , n2, soma;
        Scanner leia = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        n1 = leia.nextInt();

        System.out.println("soma dos numeros é");
        n2 = leia.nextInt();

        soma = n1 + n2;

        System.out.println("resultado " + soma);



    }
}