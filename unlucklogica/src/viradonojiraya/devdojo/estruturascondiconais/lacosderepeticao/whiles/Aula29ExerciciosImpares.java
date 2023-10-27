package viradonojiraya.devdojo.estruturascondiconais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula29ExerciciosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int num = input.nextInt();
        int i = 1;
        while (i < num) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }


    }
}
