package D;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.seeReviews();
        UserReview userReview = new UserReview();
        userReview.seeReviews();
        Shelf shelf = new Shelf();
        shelf.customizeShelf();
    }
}
