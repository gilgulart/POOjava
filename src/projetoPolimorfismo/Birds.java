package projetoPolimorfismo;

public class Birds extends Animal{
    private String featherColor;

    @Override
    public void moove() {
        System.out.println("Voando");
    }

    @Override
    public void eat() {
        System.out.println("Comendo minhoca");
    }

    @Override
    public void makeNoise() {
        System.out.println("Som de pássaro");
    }
    public void makeNest(){
        System.out.println("Fazendo ninho");
    }
}
