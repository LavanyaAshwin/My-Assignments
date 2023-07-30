package week2.assignments;

import java.util.ArrayList;
import java.util.List;

public class ListAssignments {
	
	public static void main(String[] args) {
		
		int [] a= {3,2,11,4,6,7};
		int [] b= {1,2,8,4,9,7};
		
		List <Integer> array1= new ArrayList<Integer>();
		
	    List <Integer> array2= new ArrayList<Integer>();
	    
	    //to print all elements in array
	    
	    for (int i=0;i<a.length;i++)
		{
			array1.add(a[i]);
		}
		for (int j=0;j<b.length;j++)
		{
			array2.add(b[j]);
		}
		System.out.println("List of elements in array a is "+ array1);
		System.out.println("List of elements in array b is "+ array2);
		
		System.out.println();
		
        for (int i=0;i<array1.size();i++)
        {
        	for (int j=0;j<array2.size();j++)
        	{
        		if (array1.get(i)==array2.get(j))
        		{
        			System.out.println("The matching numbers from the given arrays are " + array2.get(j));
        		}
        	}
        }
	    
	    	
	    	
	
	}  
		
	}
    
    
    


