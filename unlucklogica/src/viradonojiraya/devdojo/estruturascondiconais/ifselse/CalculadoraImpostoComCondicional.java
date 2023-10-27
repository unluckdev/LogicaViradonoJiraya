package viradonojiraya.devdojo.estruturascondiconais.ifselse;

/*
Dado um determinado salário
Se o salário for maior que 4500 imprima 30% senão imprima 10% do valor
 Desafio1: Utilize apenas uma variável para guardar o resultado
 Desafio2: Diga na impresao se é 30% ou 10%

 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4600.00F;
        float resultado = 0F;
        String porcentage = "";
        if (salario > 4500){
            resultado = salario * 0.3F;
            porcentage = "30%";
        } else {
            resultado = salario * 0.1F;
            porcentage = "10%";
        }
        System.out.println("O valor é de R$ " + resultado + ", "+
                porcentage + " do salário.");
    }
}
