package com.example.telegramresttemplate.dto;

import java.util.ArrayList;

class Chat {
    public int id;
    public String first_name;
    public String last_name;
    public String type;

    class Message {
        public int message_id;
        public From from;
        public Chat chat;
        public int date;
        public String text;
        public ArrayList<Entity> entities;
    }
}
