import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int idade;
                Scanner scan = new Scanner(System.in);
        System.out.println("digite a sua idade ");
        idade = scan.nextInt();
        if (idade>=16) {
            System.out.println("pode votar");

        } else{
            System.out.println("nao pode votar");
            
        }
    }
}
