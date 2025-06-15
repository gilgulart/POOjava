package projetoPolimorfismo;

public class Mammal extends Animal{
    private String furColor;

    @Override
    public void moove() {
        System.out.println("Correndo");
    }

    @Override
    public void eat() {
        System.out.println("Mamando");
    }

    @Override
    public void makeNoise() {
        System.out.println("Som de mamífero");
    }
}
