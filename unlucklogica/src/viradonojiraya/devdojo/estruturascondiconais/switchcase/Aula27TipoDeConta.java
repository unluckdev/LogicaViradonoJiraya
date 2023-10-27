package viradonojiraya.devdojo.estruturascondiconais.switchcase;

public class Aula27TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_INVESTIMENTO";
        switch (conta) {
            case "CONTA_POUPANCA":
                System.out.println("JUROS 0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("JUROS 0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("JUROS 0.01%");
                break;
            default:
                System.out.println("Tipo de conta não encontrado");
                break;
        }
    }
}
