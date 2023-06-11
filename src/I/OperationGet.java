package I;

public interface OperationGet {
    default void ShowDetailsEmployee() {
        System.out.println("Show details about Employee...");
    }
}
