import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]posicao = new int [4];

        for (int i =  0; i< 4; i++){
            System.out.println("informe um numero");
            posicao [i] = scan.nextInt();

        }
        for (int i = 0; i< 4; i++){
            System.out.print( posicao [i] +", ");
        }



    }
}