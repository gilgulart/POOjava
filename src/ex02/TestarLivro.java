package ex02;

public class TestarLivro {
    public static void main(String[] args) {
    Livro livro1 = new Livro("A culpa é das estrelas", "Jhon Green", 2012);
    livro1.exibirDetalhes();
    Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
    livro2.exibirDetalhes();
    Livro livro3 = new Livro("O pequeno Príncipe", "Antoine e Saint-Exupéry", 1943);
    livro3.exibirDetalhes();
    livro2.emprestar();
    livro2.exibirDetalhes();
    livro2.emprestar();
    livro1.devolver();
    livro2.devolver();
    livro2.exibirDetalhes();
    livro2.devolver();
    }
}
