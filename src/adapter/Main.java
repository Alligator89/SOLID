package adapter;

public class Main {
    public static void main(String[] args) {
        Sender sender=new TelegramLogic();
        sender.send();
    }
}
