package viradonojiraya.devdojo.estruturascondiconais.ifselse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o sexo M/F: ");
        String sexo = input.next();
        System.out.println("Entre com a idade: ");
        int idade = input.nextInt();

        if ((sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equals("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else {
            System.out.println("Alistamento obtativo.");
        }
    }
}
