import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        double nota1, nota2, media;
        Scanner leia = new Scanner(System.in);
        System.out.println("digite a primeira nota ");
        nota1 = leia.nextDouble();
        System.out.println("digite a segunda nota ");
        nota2 = leia.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("sua media final é " + media);
    }
}
