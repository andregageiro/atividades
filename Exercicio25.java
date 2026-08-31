import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, soma;
        soma = 0;
        numero = 1;

        while (numero != 0) {
            System.out.println("digite o preco do produto (0 para parar");
            numero = scan.nextInt();
            soma = soma + numero;
        }
        System.out.println("valor total da compra: R$ " + soma);
    }
}
