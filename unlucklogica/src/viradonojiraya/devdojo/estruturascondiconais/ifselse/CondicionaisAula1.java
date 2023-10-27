package viradonojiraya.devdojo.estruturascondiconais.ifselse;

public class CondicionaisAula1 {
    public static void main(String[] args) {
        boolean condicao = false;
        if (condicao) { //IF sempre verifica se é verdade, se for false nunca é executado
            System.out.println("Dentro do IF");
        } else {
            System.out.println("Dentro do ELSE");
        }
        System.out.println("Fora do IF");
    }
}
