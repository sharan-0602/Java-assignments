package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		
Set<String> mentors = new HashSet<String>(); //HashSet --> Random order
		
//Set<String> mentors = new TreeSet<String>(); //TreeSet syntax --> ASCII order
	
//Set<String> mentors = new LinkedHashSet<String>(); //LinkedHashSet syntax --> Insertion order

System.out.println("The set is: "+mentors);
mentors.add("Harish");
mentors.add("Uday");
mentors.add("Vinoth");
mentors.add("Muthu");
System.out.println("The current set is : "+ mentors);

//											0		1	2		3
//LinkedHashSet --> The current set is : [Harish, Uday, Vinoth, Muthu]------> Insertion order

//											0		1		2	3
//TreeSet --------> The current set is : [Harish, Muthu, Uday, Vinoth] -----> ASCII order

//											0		1		2		3
//HashSet ----------> The current set is : [Vinoth, Harish, Muthu, Uday]-----> Random order

//In Set interface, the retrieving value is also differs based on storing values.  So get() method is not possible
//in Set.

//Adding duplicate
mentors.add("Uday");
System.out.println(mentors);

//Remove element
mentors.remove("Uday");
System.out.println(mentors);

//To count
int count = mentors.size();
System.out.println(count);

//Add All

Set<String> trainers= new HashSet<String>();
trainers.addAll(mentors);
System.out.println(trainers);

//To retrieve an element
//Step1 : Convert the set into list and use get() method in list
//Step2 : Use get() method in list

// Declare an empty list

List<String> allTrainers=new ArrayList<String>(trainers);//Set name is passed here in this as argument
System.out.println("The initial list is: "+allTrainers);

//						0		1		2
//The initial list is: [Vinoth, Harish, Muthu]

String DataAtIndex = allTrainers.get(2);
System.out.println(DataAtIndex);

	}

}
