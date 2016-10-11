package ru.cources;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.cources.dao.ChatDao;
import ru.cources.model.Chat;
import ru.cources.model.Message;
import ru.cources.model.User;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class Application {
    public static void main(String[] args) throws IOException {
        User putin = new User(1L, "Putin V.V.");
        User obama = new User(1L, "Obama B.");

        Message message = new Message("Leave Ukrane", obama, putin);
        Chat chat = new Chat();
        chat.create(putin)
                .withUser(obama)
                .sendMessage(message)
                .build();

        String chatId = new ChatDao().save(chat);
        Chat chat1 = new ObjectMapper().readValue(new FileReader(chatId + ".json"), Chat.class);


    }
}
