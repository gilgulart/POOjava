package projetoPolimorfismo;

public class Dog extends Mammal{
    @Override
    public void moove() {
        super.moove();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }
    public void wagTail(){
        System.out.println("Abanando o rabo");
    }
    public void buryBone(){
        System.out.println("Enterrando Osso");
    }
}
