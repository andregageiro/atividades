import java.util.Scanner;

     public class Exercicio4 {

     public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int numero ,dobro, triplo;
    System.out.println("digite um numero");
    numero = leia.nextInt();

    dobro = numero * 2;
    triplo = numero * 3;

    System.out.println("o dobro é " + dobro);
    System.out.println("o triplo é " + triplo);



    }
}