import java.util.Scanner;

     public class Exercicio5 {
         public static void main(String[] args) {



        Scanner leia = new Scanner(System.in);
        int idade, meses;
        System.out.println("digite um numero ");
        idade = leia.nextInt();
        meses = 12 * idade;
        System.out.println("sua idade em meses é " + meses);



    }
}
