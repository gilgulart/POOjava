package aula06;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", "M", 18);
        Aluno p2 = new Aluno("Maria", "F", 15, 554, "informática");
        Professor p3 = new Professor("José", "M", 45, "Física",3.500f);
        Funcionario p4 = new Funcionario("Sara", "F", 21, "Central", true);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
