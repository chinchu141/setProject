// Java program to demonstrate the
// union, intersection and difference
// operations on the Set
package com.scg.setpackage;
import java.util.*;
public class SetOperationsDemo {
	
		public static void main(String args[])
		{
			Set<Integer> set1 = new HashSet<Integer>();
			set1.addAll(Arrays.asList(
				new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
			
			//another set
			
			Set<Integer> set2 = new HashSet<Integer>();
			set2.addAll(Arrays.asList(
				new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
			
            System.out.println("Set 1 Elements:" +set1);
            System.out.println("Set 2 Elements:" +set2);
            
			// To find union
			Set<Integer> union = new HashSet<Integer>(set1);
			union.addAll(set2);
			System.out.print("Union of the two Set");
			System.out.println(union);

			// To find intersection
			Set<Integer> intersection = new HashSet<Integer>(set1);
			intersection.retainAll(set2);
			System.out.print("Intersection of the two Set   :  ");
			System.out.println(intersection);

			// To find the symmetric difference
			Set<Integer> difference = new HashSet<Integer>(set1);
			difference.removeAll(set2);
			System.out.print("Difference of the two Set (set1 - set2)  :  ");
			System.out.println(difference);
			// To find the symmetric difference
			Set<Integer> difference2 = new HashSet<Integer>(set2);
			difference2.removeAll(set1);
		    System.out.print("Difference of the two Set (set2 - set1)  : ");
			System.out.println(difference2);
		}
	}


