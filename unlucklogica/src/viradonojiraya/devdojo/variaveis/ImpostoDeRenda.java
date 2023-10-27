package viradonojiraya.devdojo.variaveis;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 5000F;

        if (salario <= 1903.98) {
            System.out.println("Isento de imposto");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Imposto 7,5%, valor do imposto: R$ " + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Imposto 15%, valor do imposto: R$ " + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Imposto 22,5%, valor do imposto: R$ " + (salario * 0.225));
        } else {
            System.out.println("Imposto 27,5%, valor do imposto: R$ " + (salario * 0.275));
        }
    }
}
