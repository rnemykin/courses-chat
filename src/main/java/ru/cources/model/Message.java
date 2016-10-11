package ru.cources.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class Message {
    private Long id;
    private String text;
    @JsonFormat("yyyy-MM-dd hh:mm:ss.S")
    private LocalDateTime sentTime = LocalDateTime.now();
    private User author;
    private User recepient;

    public Message() {
    }

    public Message(String text, User recepient, User author) {
        this.text = text;
        this.recepient = recepient;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void setSentTime(LocalDateTime sentTime) {
        this.sentTime = sentTime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getRecepient() {
        return recepient;
    }

    public void setRecepient(User recepient) {
        this.recepient = recepient;
    }
}
