package projetoPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Dog d = new Dog();
        Kangaroo k = new Kangaroo();
        m.setWeight(5.70);
        m.setAge(8);
        m.setMembers(4);

        k.setWeight(55.30);
        k.setAge(3);
        k.setMembers(4);
        k.moove();
        k.eat();
        k.makeNoise();
        k.kangarooBag();

        d.setWeight(3.94);
        d.setAge(5);
        d.setMembers(4);
        d.moove();
        d.eat();
        d.makeNoise();
        d.wagTail();
        d.buryBone();
        System.out.println(d.toString());
        System.out.println(k.toString());
    }
}
