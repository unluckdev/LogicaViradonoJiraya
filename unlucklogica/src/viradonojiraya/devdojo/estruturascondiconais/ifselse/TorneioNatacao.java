package viradonojiraya.devdojo.estruturascondiconais.ifselse;

public class TorneioNatacao {
    public static void main(String[] args) {
        String competidor = "Augusto";
        int idade = 18;
        if (idade <= 10) {
            System.out.println(competidor + " participará da categoria Infantil");
        } else if (idade > 10 && idade <= 15) {
            System.out.println(competidor + " participará da categoria Juvenil");
        } else if (idade > 15 && idade <= 19) {
            System.out.println(competidor + " participará da categoria Pré-Adulto");
        } else {
            System.out.println(competidor + " participará da categoria Adulto");
        }
    }
}
