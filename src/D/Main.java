package D;

public class Main {
    public static void main(String[] args) {
        Product product = new Book();
        product.seeReviews();
        Product product1 = new Journal();
        product1.seeReviews();
    }
}
