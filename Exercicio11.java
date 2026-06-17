import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        n1 = scan.nextDouble();
        System.out.println("digite o segundo numero");
        n2 = scan.nextDouble();

        if(n1 > n2){
            System.out.println("o maior numero é " + n1);
        }else if (n1==n2){
            System.out.println("eles sao iguais " + n2);
        } else {
            System.out.println("esse numero é o maior " + n2);
        }











    }
}
