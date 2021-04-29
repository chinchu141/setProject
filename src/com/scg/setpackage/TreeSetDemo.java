package com.scg.setpackage;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		//Creating and adding elements  
		TreeSet<String> treeset=new TreeSet<String>();  
		treeset.add("Ravi");  
		treeset.add("Vijay");  
		treeset.add("Vijay");  
		treeset.add("Ajay");  
		
		//Traversing elements  
		System.out.println("Elements in TreeSet :\n");
		Iterator<String> itr=treeset.iterator();  
		while(itr.hasNext()){  
		  System.out.println(itr.next());  
		}  
		
		treeset.add("Binu"); //keep sorted set
		
		System.out.println("Elements in TreeSet :"+treeset);
		System.out.println("\nTraversing element through Iterator in descending order\n");  
        Iterator<String> i=treeset.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
	}

}
