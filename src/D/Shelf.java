package D;

public class Shelf {
    Product product;

    public void addProduct(Product product) {
        this.product = product;
    }

    public void customizeShelf() {
        System.out.println("Разместить  на полке " + this.product);
    }
}
