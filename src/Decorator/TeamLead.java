package Decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(SeniorDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("Can give some advices...");
    }
}
