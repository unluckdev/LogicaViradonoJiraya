package viradonojiraya.devdojo.estruturascondiconais.ifselse;

import java.util.Scanner;

public class TorneioNatacaoEntradaDeDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do competidor: ");
        String nome = input.next();
        System.out.println("Entre com a idade do competidor: ");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria Pré-Adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
