package I;

public class SeniorEmployee implements OperationAdd, OperationGet {
    @Override
    public void AddDetailsEmployee() {
        System.out.println("Add details about Employee...");
    }

    @Override
    public void ShowDetailsEmployee() {
        System.out.println("Show details about Employee...");
    }
}
