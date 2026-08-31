import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        double numero, soma;
        Scanner scan = new Scanner(System.in);

        soma = 0;
        for (double i = 1; i <=6; i++){
            System.out.println("digite um numero ");
            numero = scan.nextDouble();
            if (numero > 0)
                soma = soma + numero;

        }
        System.out.println("a soma dos numeros positivo é " + soma);













    }
}
