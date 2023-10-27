package viradonojiraya.devdojo.arrays.multidimensional;

import java.util.Scanner;

public class Aula42ArraysMultiDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o tamanho da matriz : ");
        int tamanho = scanner.nextInt();

        int[][] matriz = new int[tamanho][tamanho];
        int diagonal = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Entre com o valor da posição: [" + i + "][" + j + "] = ");
                matriz[i][j] = scanner.nextInt();

                if (i == j) {
                    diagonal = diagonal * matriz[i][j];
                }
            }
        }

        System.out.println("O valor da multiplicação da diagonal é = " + diagonal);

    }
}
