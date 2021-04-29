// Java program to demonstrate the
// creation of Set object using
// the LinkedHashset class

package com.scg.setpackage;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> linkedset = new LinkedHashSet<String>();
		 
        // Adding elements into the LinkedHashSet
        // using add()
        linkedset .add("India");
        linkedset .add("Australia");
        linkedset .add("South Africa");
 
        // Adding the duplicate
        // element
        linkedset .add("India");
 
        // Displaying the LinkedHashSet
        System.out.println("set Elements : "+linkedset );
 
        // Removing items from LinkedHashSet
        // using remove()
        linkedset .remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:  " + linkedset );
 
        // Iterating over linked hash set items
        System.out.println("Iterating over set  :");
        Iterator<String> i = linkedset .iterator();
        while (i.hasNext())
            System.out.println(i.next());
        
             
        

	}

}
