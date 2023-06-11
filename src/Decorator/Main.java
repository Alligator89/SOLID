package Decorator;

public class Main {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper=new JuniorDeveloper();
SeniorDeveloper seniorDeveloper=new SeniorDeveloper(juniorDeveloper);
seniorDeveloper.writeCode();
TeamLead teamLead=new TeamLead(new SeniorDeveloper(new JuniorDeveloper()));
teamLead.writeCode();
    }
}
