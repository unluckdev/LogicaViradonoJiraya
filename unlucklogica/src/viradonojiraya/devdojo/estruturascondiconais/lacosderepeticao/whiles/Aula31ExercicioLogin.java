package viradonojiraya.devdojo.estruturascondiconais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula31ExercicioLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean validandoUsuario = true;
        while (validandoUsuario) {
            System.out.println("Digite seu Login: ");
            String autenticatorLogin = scanner.nextLine();
            System.out.println("Entre com o password: ");
            String autenticatorPassword = scanner.nextLine();

            if (login.equals(autenticatorLogin) && password.equals(autenticatorPassword)) {
                System.out.println("ACESSO CONCEDIDO");
                validandoUsuario = false;
                break;
            }
                System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
