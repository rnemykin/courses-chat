package ru.cources.dao;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import org.apache.commons.lang3.RandomStringUtils;
import ru.cources.model.Chat;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ChatDao {
    public static final ObjectMapper mapper = new ObjectMapper()
            .findAndRegisterModules()
            .setDateFormat(ISO8601DateFormat.getDateTimeInstance());

    public String save(Chat chat) {
        try {
            chat.setId(RandomStringUtils.randomAlphabetic(10));
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(chat.getId() + ".json"), chat);
            return chat.getId();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
