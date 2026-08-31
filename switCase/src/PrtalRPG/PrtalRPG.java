package PrtalRPG;

import java.util.Scanner;

public class PrtalRPG {

    public static void mostrarClasses(String[] classes) {
        System.out.println("\n=== BEM-VINDO AO PORTAL DAS CASTAS ===");
        System.out.println("Escolha sua classe:");

        for (int i = 0; i < classes.length; i++) {
            System.out.println((i + 1) + " - " + classes[i]);
        }

        System.out.println("0 - Sair");
    }

    public static void exibirFicha(String nome, String classe, String missao,
                                   String poderEspecial, int vida, int ataque, int defesa) {

        System.out.println("\n==============================");
        System.out.println("      FICHA DO PERSONAGEM");
        System.out.println("==============================");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Missão: " + missao);
        System.out.println("Poder Especial: " + poderEspecial);
        System.out.println("Vida Final: " + vida);
        System.out.println("Ataque Final: " + ataque);
        System.out.println("Defesa Final: " + defesa);

        if (vida >= 140) {
            System.out.println("\nParabéns! Seu personagem terminou a aventura com uma vida impressionante!");
        }
    }

    public static String escolherMissao(int escolhaMissao) {

        switch (escolhaMissao) {
            case 1:
                return "Floresta Sombria";

            case 2:
                return "Caverna dos Cristais";

            case 3:
                return "Defender a Vila do Reino";

            default:
                return "";
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] classes = {"Guerreiro", "Mago", "Ladino", "Clérigo"};
        int[] vidas = {150, 90, 110, 120};
        int[] ataques = {25, 40, 30, 20};
        int[] defesas = {20, 10, 15, 25};
        String[] poderes = {
                "Fúria de Batalha",
                "Bola de Fogo",
                "Ataque Furtivo",
                "Benção Divina"
        };

        while (true) {

            mostrarClasses(classes);

            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 0) {
                System.out.println("Obrigado por jogar!");
                break;
            }

            if (opcao < 1 || opcao > classes.length) {
                System.out.println("Classe inválida!");
                continue;
            }

            int pos = opcao - 1;

            String classe = classes[pos];
            int vida = vidas[pos];
            int ataque = ataques[pos];
            int defesa = defesas[pos];
            String poderEspecial = poderes[pos];

            System.out.print("\nDigite o nome do personagem: ");
            String nome = scan.nextLine();

            System.out.println("\nEscolha sua primeira missão:");
            System.out.println("1 - Explorar a Floresta Sombria");
            System.out.println("2 - Entrar na Caverna dos Cristais");
            System.out.println("3 - Defender a Vila do Reino");

            int escolhaMissao = scan.nextInt();

            String missao = escolherMissao(escolhaMissao);

            switch (escolhaMissao) {

                case 1:
                    ataque += 10;
                    System.out.println("Você derrotou criaturas da floresta e ganhou +10 de ataque!");
                    break;

                case 2:
                    defesa += 10;
                    System.out.println("Os cristais fortaleceram sua defesa em +10!");
                    break;

                case 3:
                    vida -= 15;
                    System.out.println("Você protegeu a vila, mas perdeu 15 pontos de vida.");
                    break;

                default:
                    System.out.println("Missão inválida!");
                    continue;
            }

            exibirFicha(nome, classe, missao, poderEspecial, vida, ataque, defesa);

            System.out.println("\nDeseja jogar novamente?");
            System.out.println("1 - Sim");
            System.out.println("0 - Sair");

            int jogarNovamente = scan.nextInt();

            if (jogarNovamente == 0) {
                System.out.println("Obrigado por jogar!");
                break;
            }
        }

        scan.close();
    }
}