import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]posicao = new int [5];
        for (int i =  0; i< 5; i++){
            System.out.println("informe um numero");
            posicao [i] = scan.nextInt();

        }
        for (int i = 0; i< 5; i++){
            System.out.print( posicao [i]*3 +", ");
        }



    }
}