import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        System.out.println("digite cinco numeros");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            A[i] = scan.nextInt();
        }
        int j = 4;
        for (int i = 0; i < 5; i++) {
            B[j] = A[i];
            j--;
        }
        System.out.print("Vetor A ");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.print("Vetor B ");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }
        scan.close();
    }
}
