package Aula03;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
    	//byte bait = 128;
        //Observe NetBeans' complaint

        
        //Declare and initialize a short with a value of 128
    	short shortes = 128;
        //Create a print statement that casts this short to a byte
        byte mybyte;
        mybyte = (byte)shortes;
        System.out.println(mybyte);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte bait = 127;
        bait++;
        System.out.println(bait);
        bait++;
        System.out.println(bait);
        
        
    }    
}