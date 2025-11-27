package chat;

import java.time.LocalDate;
import java.util.List;

public class Chat 
{
    private String chatID;
    private List<String> messages;
    private LocalDate startOfChat;
    private LocalDate endOfChat;
    private String sender;
    private String receiver;
    private String channel;
    private String phoneNumber;

    public Chat(String chatID, String sender, String receiver, String channel, String phoneNumber) 
    {
        this.chatID = chatID;
        this.messages = null;
        this.startOfChat = null;
        this.endOfChat = null;
        this.sender = sender;
        this.receiver = receiver;
        this.channel = channel;
        this.phoneNumber = phoneNumber;
    }

    public String getChatID() {
        return this.chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public List<String> getMessages() {
        return this.messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public LocalDate getStartOfChat() {
        return this.startOfChat;
    }

    public void setStartOfChat(LocalDate startOfChat) {
        this.startOfChat = startOfChat;
    }

    public LocalDate getEndOfChat() {
        return this.endOfChat;
    }

    public void setEndOfChat(LocalDate endOfChat) {
        this.endOfChat = endOfChat;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}