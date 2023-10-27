package viradonojiraya.devdojo.augusto;

public class AugustoEscadinhaDupla {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 1; i <= num ; i++) {

            String result = new String(new char[i]).replace("\0", "#");
            String decresce = new String(new char[num - i]).replace("\0", "_");

            System.out.println(decresce + result + " " + result + decresce );

        }
    }
}
