package projetoHeranca;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Student s1 = new Student();
        Colleger c1 = new Colleger();
        v1.setName("João");
        v1.setAge(22);
        v1.setGender("M");
        System.out.println(v1.toString());
        s1.setCourse("Informática");
        s1.setStudentID(99999);
        s1.payMensality();
        System.out.println(s1.toString());
        c1.setStudentID(9875);
        c1.setName("Jubileu");
        c1.setSchoolarship(12.5f);
        c1.setGender("M");
        c1.payMensality();
        System.out.println(c1.toString());
    }
}
