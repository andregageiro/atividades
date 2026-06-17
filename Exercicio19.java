import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        String usuario;
        int senha;
        Scanner scan = new Scanner(System.in);



        System.out.println("digite o usuario ");
        usuario = scan.next();
        System.out.println("digite a senha ");
        senha = scan.nextInt();

        if((usuario.equals("admin")  && senha == 1234)){
            System.out.println("acesso permitido");




        }else {
            System.out.println("acesso negado");


        }
















    }
}
