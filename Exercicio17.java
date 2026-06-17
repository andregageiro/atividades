import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a primeira nota");
        nota1 = scan.nextDouble();
        System.out.println("digite a segunda nota");
        nota2 = scan.nextDouble();
        System.out.println("digite a terceira nota");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("media " + media);
        if (media >= 7) {

        } else if (media >= 5) {
            System.out.println("recuperacao");
        } else {
            System.out.println("reprovado");



            }


        }
    }
