package Aula07;

public class Terminal {
    private Card card;
    private PrizeCategory[] prizeCategories;
    
    public Terminal(PrizeCategory[] prizeCategories) {
        this.prizeCategories = prizeCategories;
    }
    
    public void insertCard(Card card) {
        this.card = card;
    }
    
    public void addCredits(int amount) {
        int creditsToAdd = amount * 2; // Cada dólar é convertido em 2 créditos
        card.setCreditBalance(card.getCreditBalance() + creditsToAdd);
    }
    
    public void transferCredits(Card targetCard, int amount) {
        if (card.getCreditBalance() >= amount) {
            card.setCreditBalance(card.getCreditBalance() - amount);
            targetCard.setCreditBalance(targetCard.getCreditBalance() + amount);
            System.out.println("Créditos transferidos com sucesso.");
        } else {
            System.out.println("Saldo de créditos insuficiente para transferência.");
        }
    }
    
    public void checkCardBalance() {
        System.out.println("Cartão " + card.getCardNumber() + ": Saldo de créditos: " + card.getCreditBalance() + ", Saldo de tickets: " + card.getTicketBalance());
    }
    
    public void redeemPrize(String category) {
        PrizeCategory prizeCategory = findPrizeCategoryByName(category);
        if (prizeCategory != null) {
            if (card.getTicketBalance() >= prizeCategory.getRequiredTickets()) {
                if (prizeCategory.getRemainingItems() > 0) {
                    card.setTicketBalance(card.getTicketBalance() - prizeCategory.getRequiredTickets());
                    prizeCategory.setRemainingItems(prizeCategory.getRemainingItems() - 1);
                    System.out.println("Prêmio da categoria " + prizeCategory.getName() + " resgatado com sucesso.");
                } else {
                    System.out.println("Sem mais itens disponíveis na categoria " + prizeCategory.getName() + ".");
                }
            } else {
                System.out.println("Saldo de tickets insuficiente para resgatar o prêmio da categoria " + prizeCategory.getName() + ".");
            }
        } else {
            System.out.println("Categoria de prêmio não encontrada.");
        }
    }
    
    private PrizeCategory findPrizeCategoryByName(String category) {
        for (PrizeCategory prizeCategory : prizeCategories) {
            if (prizeCategory.getName().equals(category)) {
                return prizeCategory;
            }
        }
        return null;
    }
}