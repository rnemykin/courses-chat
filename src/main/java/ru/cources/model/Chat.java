package ru.cources.model;

import java.util.HashSet;
import java.util.Set;

public class Chat {
    private String id;
    private User author;
    private User interlocutor;
    private Set<Message> messages = new HashSet<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getInterlocutor() {
        return interlocutor;
    }

    public void setInterlocutor(User interlocutor) {
        this.interlocutor = interlocutor;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public Chat create(User author) {
        this.author = author;
        return this;
    }

    public Chat withUser(User interlocutor) {
        this.interlocutor = interlocutor;
        return this;
    }

    public Chat sendMessage(Message message) {
        this.messages.add(message);
        return this;
    }

    public Chat build() {
        return this;
    }


    public void print() {
        for (Message message : messages) {
            System.out.println(message);
        }
    }




}
