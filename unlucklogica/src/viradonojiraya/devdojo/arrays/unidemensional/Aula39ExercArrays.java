package viradonojiraya.devdojo.arrays.unidemensional;

import java.util.Scanner;

public class Aula39ExercArrays {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Inclua a posição " + (i + 1) + " do Vetor1: ");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Inclua a posição " + (i + 1) + " do Vetor2: ");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.println("O valor da multiplicação do Vetor1 x Vetor2 na posição " + (i + 1) + " é igual a: " + array3[i]);
        }
    }
}
