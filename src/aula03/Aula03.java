package aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic",  0.5f, "Azul",false);
         System.out.println("Tenho uma caneta " + c1.getModelo() + ", de ponta " + c1.getPonta());
    }
}
