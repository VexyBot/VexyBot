package su.vexy.vexybot.helper;

import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import su.vexy.vexybot.bots.TelegramBot;
import su.vexy.vexybot.manager.ChatsManager;
import su.vexy.vexybot.manager.MessageManager;
import su.vexy.vexybot.manager.WeatherManager;
import su.vexy.vexybot.services.Geocoder;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class WeatherHelper implements Helper {
    public static void getWeather(Message message) throws IOException, JAXBException, TelegramApiException {
        String geo = "";
        String text;
        if (message.hasLocation()) {
            geo = Geocoder.getTextByCoordinates(message);
        } else if (message.hasText()) {
            geo = message.getText();
        }
        text = WeatherManager.getText(geo);
        int temp = WeatherManager.getTemp(geo);
        TelegramBot.bot.sendMessage(MessageManager.getSendMessage(message,
                text + "\nТемпература: " + temp + "°C"));
        ChatsManager.removeStatus(message);
    }
}
