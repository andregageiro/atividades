import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = {7, 21, 15, 12, 82};
        int numero;
        System.out.println("digite um numero");
        numero = scan.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < A.length; i++){
            if (A[i] == numero){
                System.out.println("elemento encontrado");
                encontrado = true;
                break;


            }
        }
        if (!encontrado){
            System.out.println("elemento nao encontrado");

        }
        scan.close();




    }
}
