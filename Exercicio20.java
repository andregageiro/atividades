import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int quantidade;
        double valor_unitario, total;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a quantidade de ingressos ");
        quantidade = scan.nextInt();
        System.out.println("digite o valor do ingresso ");
        valor_unitario = scan.nextDouble();
        total = quantidade * valor_unitario;

        if (quantidade >= 5){
            total = total - (total * 15 / 100);
        }else{
            System.out.println("total da compra" + total);





        }























    }
}
