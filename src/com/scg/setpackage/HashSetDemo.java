package com.scg.setpackage;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		        // Creating a set using the HashSet class
		        Set<Integer> hashset = new HashSet<>();

		        // Add elements to the set
		        hashset.add(2);
		        hashset.add(3);
		        System.out.println("Set: " + hashset);
		        
		        //we can add element from a list
		      
		        List<Integer> newlist = new ArrayList<>() ; 
		        		
		        newlist.add(10);
		        newlist.add(20);
		        newlist.add(15);
		  //      new_list.add(10);
		        newlist.add(3);
		        			
		        	
		        System.out.println("List: " + newlist);
		      //convert list to set
		        hashset.addAll(newlist);
		        System.out.println("new set: " + hashset);
		        
		     // Removing the specific element -15
		       // ha_shset.remove(15);
		 
		        System.out.println("After removing element " + hashset);
		        
            //Removing all the list elements from HashSet  
		        hashset.removeAll(newlist);  
		        System.out.println("After invoking removeAll() method: "+hashset); 
		        
		        hashset.add(20);
		        hashset.add(13);
		        
		        System.out.println("new set: " + hashset);
		      //Removing all the elements available in the HashSet  
		           hashset.clear();  
		           System.out.println("After invoking clear() method: "+hashset);  
		    
		           System.out.println("Traversing element through Iterator in descending order");  
		           
		      
		        
		}

	}


