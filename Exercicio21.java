import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;
        int contador;

        contador = 0;

        for (int i = 1; i <=6; i++) {
            System.out.println("digite uma nota");
            nota = scan.nextDouble();


            if (nota >= 8) {
                contador = contador + 1;
                System.out.println("quantidade de notas altas " + contador);

            }
        }


















    }
}
