import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    System.out.println("Hello, Dcoder!");
   }
 }
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyTelegramBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            // Process incoming message
            String text = message.getText();
            long chatId = message.getChatId();

            SendMessage response = new SendMessage()
                    .setChatId(chatId)
                    .setText("Hello! I am your Telegram Bot.");

            try {
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        // Return bot username
        return "IndianChatgpt_bot";
    }

    @Override
    public String getBotToken() {
        // Return bot token
        return "7023809709:AAEnKoOofjq0-Kjg1lCjoQ7xR-wcyTgNVPM";
    }
        }
