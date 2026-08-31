import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]posicao = new int [5];
        int maior, menor, media;
        int soma;
        media = 0;
        soma = 0;
        maior = 0;
        menor = 999;

        for (int i =  0; i< 5; i++){
            System.out.println("informe um numero");
            posicao [i] = scan.nextInt();

            soma = soma + posicao [i];

            if (maior < posicao[i]) {
                maior = posicao [i];

            }
            if (menor > posicao[i]) {
                menor = posicao[i];

            }

        }
        for (int i = 0; i< 5; i++){
            System.out.print( posicao [i] +", ");
            media = soma / posicao[i];



        }
        System.out.println("a media é " + media);
        System.out.println("esse é o menor " + menor);
        System.out.println("esse é o maior " + maior);


    }
}