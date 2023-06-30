package Aula08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
    ArrayList <Integer> nums = new ArrayList<>();
    Iterator<Integer> iterator = nums.iterator();
    for (int i = 1; i < 50; i++) {
		nums.add(i);
	}
    
    for (Integer i: nums) {
    	int nos = i;
    	while(iterator.hasNext()){
    		if (nos % 2 != 0) {
                System.out.println(nos);
            }
            break;
        }
    	
    }
    
    
    
    
        
        
        
        
        
         
    }
}
