package Aula07;

public class PrizeCategory {
    private String name;
    private int requiredTickets;
    private int remainingItems;
    
    public PrizeCategory(String name, int requiredTickets, int remainingItems) {
        this.name = name;
        this.requiredTickets = requiredTickets;
        this.remainingItems = remainingItems;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRequiredTickets() {
        return requiredTickets;
    }
    
    public int getRemainingItems() {
        return remainingItems;
    }
    
    public void setRemainingItems(int remainingItems) {
        this.remainingItems = remainingItems;
    }
}


