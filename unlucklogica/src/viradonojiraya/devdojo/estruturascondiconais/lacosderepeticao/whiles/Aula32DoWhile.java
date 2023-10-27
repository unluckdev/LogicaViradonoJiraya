package viradonojiraya.devdojo.estruturascondiconais.lacosderepeticao.whiles;

import java.util.Random;
import java.util.Scanner;

public class Aula32DoWhile {
    public static void main(String[] args) {
      /*  boolean condicao = false;
        while (condicao){
            System.out.println("Dentro do while");
        }
        do {
            System.out.println("Dentro do while");
        } while (condicao);
    }*/

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int condicao = 1;
        do {
            int numero = random.nextInt(10);
            System.out.println("PLAYER 1: Digite um número entre 1 a 10: ");
            int num1 = scanner.nextInt();
            System.out.println("PLAYER 2: Digite um número entre 1 a 10: ");
            int num2 = scanner.nextInt();

            if (num1 == numero) {
                System.out.println("PLAYER 1 GANHOU!!!");
            } else if (num2 == numero) {
                System.out.println("PLAYER 2 GANHOU!!!");
            } else {
                System.out.println("NINGUÉM GANHOU!!!");
            }

            System.out.println("**********************************");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            condicao = scanner.nextInt();

        } while (condicao == 1);
    }
}
