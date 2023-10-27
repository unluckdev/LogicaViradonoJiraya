package viradonojiraya.devdojo.estruturascondiconais.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula34Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor que deseja saber a tabuada");
        int tabuada = scanner.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada*i);
        }
    }
}
