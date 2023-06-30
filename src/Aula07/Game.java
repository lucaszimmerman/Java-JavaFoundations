package Aula07;

import java.util.Random;

public class Game {
    private int requiredCredits;
    private int ticketPrize;
    
    public Game(int requiredCredits, int ticketPrize) {
        this.requiredCredits = requiredCredits;
        this.ticketPrize = ticketPrize;
    }
    
    public void playGame(Card card) {
        if (card.getCreditBalance() >= requiredCredits) {
            Random random = new Random();
            int ticketsWon = random.nextInt(10); // Número aleatório de tíquetes (0 a 9)
            card.setCreditBalance(card.getCreditBalance() - requiredCredits);
            card.setTicketBalance(card.getTicketBalance() + ticketsWon);
            System.out.println("Cartão " + card.getCardNumber() + ": Você ganhou " + ticketsWon + " tickets. Novo saldo de tickets: " + card.getTicketBalance());
        } else {
            System.out.println("Cartão " + card.getCardNumber() + ": Créditos insuficientes para jogar o jogo.");
        }
    }
}

