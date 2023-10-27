package viradonojiraya.devdojo.estruturascondiconais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome de usuário: ");
        String usuario = input.next();
        if (usuario.isBlank() || usuario.isEmpty() || usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido.");
        } else {
            System.out.println("Usuário cadastrado com sucesso.");
        }
    }
}
