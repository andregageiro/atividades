import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, contador;
        ;

        System.out.println("digite um numero inteiro positivo");
        numero = scan.nextInt();

        contador = 0;

        for (int i = 1; i <= numero; i++) {
            contador= contador+1;
            System.out.println(contador);

        }




    }
}
