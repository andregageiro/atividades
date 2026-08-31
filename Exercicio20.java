import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temperatura, soma, media;
        soma = 0;
        for (int i = 1;i <= 4; i++){
            System.out.println("digite a temperatura");
            temperatura = scan.nextInt();
            soma = soma + temperatura;
        }
        media = soma / 4;
        System.out.println("a media das temperatura é " + media);







    }
}
