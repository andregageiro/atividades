import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        double salario, vendas, salario_final;
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o salario do funcionario ");
        salario = scan.nextDouble();
        System.out.println("digite o valor das vendas ");
        vendas = scan.nextDouble();

        if (vendas > 5000){
            salario_final = salario + (salario * 8 / 100);


        }else{
            salario_final = salario + (salario * 3 / 100);
        }
        System.out.println("salario final " + salario_final);













    }
}
