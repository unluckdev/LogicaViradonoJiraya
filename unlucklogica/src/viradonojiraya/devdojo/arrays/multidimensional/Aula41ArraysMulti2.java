package viradonojiraya.devdojo.arrays.multidimensional;

import java.util.Scanner;

public class Aula41ArraysMulti2 {
    public static void main(String[] args) {
        int[][] arrayMulti2 = new int[2][3];
        /*
        arrayMulti2[0][0] = 11;
        arrayMulti2[0][1] = 22;
        arrayMulti2[0][2] = 33;
        arrayMulti2[1][0] = 44;
        arrayMulti2[1][1] = 55;
        arrayMulti2[1][2] = 66;
        */
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayMulti2.length; i++) {
            for (int j = 0; j < arrayMulti2[i].length; j++) {
                System.out.println("Entre com o valor da posição: [" + i + "][" + j + "] = ");
                arrayMulti2[i][j] =  scanner.nextInt();
            }
        }

        for (int i = 0; i < arrayMulti2.length; i++) {
            for (int j = 0; j < arrayMulti2[i].length; j++) {
                System.out.println("[" + i + "] [" + j + "] = " + arrayMulti2[i][j]);
            }
        }


    }
}
