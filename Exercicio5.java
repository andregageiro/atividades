import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] X = new int[10];

        // Leitura do vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            X[i] = entrada.nextInt();
        }

        int maior = X[0];
        int menor = X[0];
        int posMaior = 0;
        int posMenor = 0;

        // Procura maior e menor elemento
        for (int i = 1; i < 10; i++) {
            if (X[i] > maior) {
                maior = X[i];
                posMaior = i;
            }

            if (X[i] < menor) {
                menor = X[i];
                posMenor = i;
            }
        }

        int diferenca = maior - menor;

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Posição do maior: " + posMaior);

        System.out.println("Menor elemento: " + menor);
        System.out.println("Posição do menor: " + posMenor);

        System.out.println("Diferença entre o maior e o menor: " + diferenca);

        entrada.close();
    }
}