package com.example.telegramresttemplate.dto;

import java.util.ArrayList;

public class Message {
    public int message_id;
    public From from;
    public Chat chat;
    public int date;
    public String text;
    public ArrayList<Entity> entities;
}
