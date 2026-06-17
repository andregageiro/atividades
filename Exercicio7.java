import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1, n2, n3, resultado;
        System.out.println("digite o primeiro numero");
        n1 = leia.nextDouble();
        System.out.println("diigte o segundo numero");
        n2 = leia.nextDouble();
        System.out.println("digite o terceiro numero");
        n3 = leia.nextDouble();
        resultado = n1 * n2 * n3;
        System.out.println("resultado da multiplicao " + resultado);
    }
}
