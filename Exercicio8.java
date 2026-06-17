import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double preco, novo_preco;
        Scanner scan = new Scanner(System.in);


        System.out.println("digite o preco do produto");
        preco = scan.nextDouble();
        novo_preco = preco + (preco * 10 /100);
        System.out.println("novo preco com aumento de 10 por cento é " + novo_preco );




    }
}
