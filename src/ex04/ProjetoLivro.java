package ex04;
import java.util.Arrays;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado", "Maria Candido",800, p[0]);

        l[0].open();
        l[0].browsePages(100);
        l[0].nextPage();
        System.out.println(l[0].status());
        System.out.println(l[1].status());
    }
}
