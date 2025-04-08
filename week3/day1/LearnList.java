package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// Declare a list
		
		List<String> learns = new ArrayList<String>();
//Add a single element		
learns.add("Saranya");
//Add multiple data. Duplicate also possible. and saved as first in first out method 
learns.add("Mani");
learns.add("Selvi");
learns.add("Venkatesh");
learns.add("Saranya");
System.out.println("The currenlt list : "+learns);

//0			1		2		3			4
//[Saranya, Mani, Selvi, Venkatesh, Saranya]


//Add the element by index. like 0,1,2,3. Prasanna is added in index 1 and others are automatically moved to 
//position 2,3,4

learns.add(1, "Prasanna");
System.out.println("The list:"+ learns);

//			0			1		2		3		4			5
//The list:[Saranya, Prasanna, Mani, Selvi, Venkatesh, Saranya]

//Remove an element
learns.remove(0);
System.out.println(learns);

//To retrieve an element. Most important method. Get() available only in list. Not set

String leans1 = learns.get(1);
System.out.println(leans1);

//Size mothod --> No of data 

int listsize = learns.size();
System.out.println("Listsize is :"+ listsize);

//Sort method - Alphabetical/ASCII order

Collections.sort(learns);
System.out.println("After sorting: "+learns);	
	
//AddAll method --> Add all the elements from one list to another list
//1. declare an empty list

List<String> employee = new ArrayList<String>();
System.out.println("Empty list name is:"+employee);
employee.addAll(learns);
System.out.println("After addall method: "+employee);

//Clear all the elements in the list

learns.clear();
System.out.println("Learns list after clearing: "+learns);
	
	}
	
}
