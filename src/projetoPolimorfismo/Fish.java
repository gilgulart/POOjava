package projetoPolimorfismo;

public class Fish extends Animal{
    private String scaleColor;

    @Override
    public void moove() {
        System.out.println("Nadando");
    }

    @Override
    public void eat() {
        System.out.println("Comendo algas");
    }

    @Override
    public void makeNoise() {
        System.out.println("Som de peixe");
    }
    public void makeBubbles(){
        System.out.println("Fazendo bolhas");
    }
}
