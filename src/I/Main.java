package I;

public class Main {
    public static void main(String[] args) {
        JuniorEmployee juniorEmployee = new JuniorEmployee();
        SeniorEmployee seniorEmployee = new SeniorEmployee();
        juniorEmployee.AddDetailsEmployee();
        seniorEmployee.AddDetailsEmployee();
        seniorEmployee.ShowDetailsEmployee();
    }
}
