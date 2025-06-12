package desafioProdutos;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Product(String name, double price) {
        this(name, price, 0 );
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this(name, 0.0f, 0);
        this.name = name;
    }
    public void buy(int quantity){
        if (this.getQuantityInStock() != 0){
            this.setQuantityInStock(getQuantityInStock() - quantity);
        } else {
            System.out.println("Não temos estoque do produto");
        }
    }
    public void sell(int quantity){
        this.setQuantityInStock(getQuantityInStock() + quantity);
    }
    public void showStatus(){
        System.out.println("=======================");
        System.out.println("Produto: " + this.getName());
        System.out.println("Preço: " + this.getPrice());
        System.out.println("Quantidade em estoque: " + this.getQuantityInStock());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
