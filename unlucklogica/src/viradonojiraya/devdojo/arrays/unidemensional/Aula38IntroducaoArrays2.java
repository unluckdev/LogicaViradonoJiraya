package viradonojiraya.devdojo.arrays.unidemensional;

import java.util.Scanner;

public class Aula38IntroducaoArrays2 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            media = media + notas[i];
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        media = media / notas.length;
        System.out.println("Media das notas: " + media);

    }
}
