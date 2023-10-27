package viradonojiraya.devdojo.variaveis;

public class ReutilizandoVariaveis {
    public static void main(String[] args){
        double salario = 3500F;
        double impostoSalario = salario * 0.3;
        System.out.println("Salario imposto 30%: " + impostoSalario);

        impostoSalario = salario * 0.15;
        System.out.println("Salario imposto 15%: " + impostoSalario);

        impostoSalario = salario * 0.05;
        System.out.println("Salario imposto 5%: " + impostoSalario);

    }
}
