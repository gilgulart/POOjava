package projetoPolimorfismo;

public class Kangaroo extends Mammal{
    @Override
    public void moove() {
        System.out.println("Saltando");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }
    public void kangarooBag(){
        System.out.println("Usando bolsa");
    }
}
