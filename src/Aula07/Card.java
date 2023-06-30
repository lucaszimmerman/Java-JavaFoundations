package Aula07;

import java.util.Random;

public class Card {
    private int cardNumber;
    private int creditBalance;
    private int ticketBalance;
    
    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
        this.creditBalance = 0;
        this.ticketBalance = 0;
    }
    
    public int getCardNumber() {
        return cardNumber;
    }
    
    public int getCreditBalance() {
        return creditBalance;
    }
    
    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
    
    public int getTicketBalance() {
        return ticketBalance;
    }
    
    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }
}

