package com.scg.setpackage;
import java.util.*;
public class TreeSetDemo2 {
	public static void main(String args[]){  
		TreeSet<Integer> set=new TreeSet<Integer>();  
	    set.add(24);  
	    set.add(66);  
	    set.add(12);  
	    set.add(15);
	    set.add(60);  
	    set.add(10);  
	    set.add(55);
	    System.out.println("Elements of tree set: "+set);
	    
	    //floor returns the closest least element of the specified element
	    //from the set
	    //or null there is no such element.
	    System.out.println(" equal or closest least element of 18 :  "+set.floor(18));
	    
	    //higher returns the closest greatest element of the specified element
	    //from the set
	    //or null there is no such element.
	    System.out.println(" equal or closest highest element of 18 :  "+set.higher(18));
	    
	    System.out.println("Highest Value: "+set.first());  
	    System.out.println("Lowest Value: "+set.last()); 
	    System.out.println("Elements of tree set: "+set);
	    
	    //pollFirst pollLast
	    System.out.println("Highest Value: "+set.pollFirst());  
	    System.out.println("Lowest Value: "+set.pollLast()); 
	    System.out.println("Elements of tree set: "+set);
	    
	    //subset returns a set of elements that lie between the given range
	    //which includes fromElement and excludes toElement.
	    System.out.println("Subset b/w 15 and 55: "+set.subSet(15,55));
	    
	    //tailSet returns a set of elements 
	    //that are greater than or equal to the specified element.
	    System.out.println("tailset 0f 24: "+set.tailSet(24));
	    //headSet returns the group of elements that are less than the specified element.
	    System.out.println("Head Set: "+set.headSet(55, true)); 
	    System.out.println("Head Set: "+set.headSet(55)); 
	    
}
}