package Aula04;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        spaceIdx = custName.indexOf(" ");
        // Get the index of the space character (" ") in custName. 
        firstName = custName.substring(0,5);
        System.out.println(firstName);

        // Use the substring method parse out the first name and print it.

       
    }

    
}

