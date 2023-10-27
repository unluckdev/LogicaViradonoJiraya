package viradonojiraya.devdojo.estruturascondiconais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula30Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sair = 0;
        while (sair != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            System.out.println("Digite a opção desejada");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Imposto aplicadoxxx");
                    break;
                case 2:
                    System.out.println("Deposite o salário");
                    break;
            }
            sair = opcao;

        }
    }
}

