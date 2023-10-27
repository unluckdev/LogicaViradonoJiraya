package viradonojiraya.devdojo.estruturascondiconais.switchcase;

public class Aula26DiasDaSemanas {
    public static void main(String[] args) {
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: // Executa o default quando nenhum caso é correto
                System.out.println("Dia inválido");
        }
    }
}
