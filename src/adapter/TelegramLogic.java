package adapter;

public class TelegramLogic implements Sender {
    void sendMessageToTelegram(){
        System.out.println("logic for telegram channel");
    }
    void  s(){
        sendMessageToTelegram();
    }

    @Override
    public void send() {

    }
}
