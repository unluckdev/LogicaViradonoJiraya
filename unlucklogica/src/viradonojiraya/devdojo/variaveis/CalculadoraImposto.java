package viradonojiraya.devdojo.variaveis;

import java.util.Scanner;

public class CalculadoraImposto {
    public static void main(String[] args){
        /*float salario = 3500.33F;
        float imposto = 12.5F;
        float impostoCalculado = salario * (imposto / 100);
        System.out.print(impostoCalculado);*/

        Scanner entradaSalario = new Scanner(System.in);
        Scanner entradaImposto = new Scanner(System.in);

        System.out.print("Entre com o seu salário: ");
        float salario = Float.parseFloat(entradaSalario.nextLine());

        System.out.print("Entre com o valor do imposto aplicado: ");
        float imposto = Float.parseFloat(entradaImposto.nextLine());

        float impostoCalculado = salario * (imposto/100);

        System.out.println(impostoCalculado);


    }
}
