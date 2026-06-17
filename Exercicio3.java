import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

            int n1 , n2, soma;
        Scanner leia = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        n1 = leia.nextInt();

        System.out.println("esse é o antecessor " + (n1 - 1));
        System.out.println("esse é o sucessor " + (n1 + 1));


    }
}
