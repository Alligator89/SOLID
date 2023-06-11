package adapter;

public class TelegramAdapter extends TelegramLogic implements Sender{
    @Override
    public void send (){
      sendMessageToTelegram();
    }

}
