package ex02;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Livro ---");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Publicado em: " + this.anoPublicacao);
        System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro emprestado, se atente ao prazo de devolução!");
        } else {
            System.out.println("Desculpe, o livro' "+ this.titulo + "'já está emprestado");
        }
    }
    public void devolver() {
        if(!this.disponivel){
            this.disponivel = true;
            System.out.println("Livro'"+ this.titulo + "' devolvido com sucesso!");
        } else {
            System.out.println("O livro'" + this.titulo + " já está disponível na biblioteca.");
        }
    }
}
