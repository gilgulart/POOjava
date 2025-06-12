package desafioProdutos;
import java.util.Arrays;

public class TestProduct {
    public static void main(String[] args) {
        Product product[] =  new Product[5];
        product[0]= new Product("Calculadora", 10.00f, 100);
        product[1]= new Product("Caneta");
        product[2]= new Product("Caderno", 30.00f);
        product[3]= new Product("Lápis", 2.00f);
        product[4]= new Product("Borracha");

        product[0].showStatus();
        product[1].showStatus();
        product[1].setPrice(3.00f);
        product[1].setQuantityInStock(1000);
        product[2].showStatus();
        product[3].showStatus();
        product[4].showStatus();


    }
}
