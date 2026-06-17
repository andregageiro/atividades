import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double temperatura;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a temperatura em celsius ");
        temperatura = scan.nextDouble();

        if (temperatura < 18) {
            System.out.println("frio");

        }else if (temperatura <=27) {
            System.out.println("agradavel");
        }else{
            System.out.println("quente");

        }















        scan.close();




















    }
}
