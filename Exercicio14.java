import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double valor, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor da compra");
        valor = scan.nextDouble();
    if (valor >100) {
        total = valor - (valor * 10 / 100);


        }else {
        total = valor;


        }
        System.out.println("valor final da compra" + total);



    }
}
