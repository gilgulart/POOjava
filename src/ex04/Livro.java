package ex04;

public class Livro implements Publicacao {
    private String title, author;
    private int totalPages, currentPage;
    private boolean open;
    private Pessoa reader;


    public String status() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPages=" + totalPages +
                ", currentPage=" + currentPage +
                ", open=" + open +
                ", reader=" + reader.getName() + ", age= " + reader.getAge() +
                ", gender=" + reader.getGender() + '}';
    }

    @Override
    public void open() {
        if (! this.isOpen()){
            this.setOpen(true);
            System.out.println("livro aberto");
        } else {
            System.out.println("O livro já está aberto");
        }
    }

    @Override
    public void close() {
        if (this.isOpen()){
            this.setOpen(false);
            System.out.println("livro fechado");
        } else {
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void browsePages(int page) {
        if (page > this.totalPages){
            this.setCurrentPage(0);
        }
        this.setCurrentPage(page);
    }

    @Override
    public void nextPage() {
        if (this.isOpen()){
        this.currentPage++;
        }
    }

    @Override
    public void backPage() {
        if (this.isOpen()){
        this.currentPage--;
        }
    }

    public Livro(String title, String author, int totalPages, Pessoa reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.reader = reader;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPages) {
        this.currentPage = currentPages;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Pessoa getReader() {
        return reader;
    }

    public void setReader(Pessoa reader) {
        this.reader = reader;
    }
}
