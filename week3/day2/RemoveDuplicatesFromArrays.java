package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrays {

	public static void main(String[] args) {

int numbers[] = {3,5,3,5,6,8,2};// output should be {2,3,5,6,8}. If order not changed means use Linked. 
//it uses insertion order

Set<Integer> uniqueSet = new LinkedHashSet<Integer>();

for (int i = 0; i < numbers.length; i++) {
	
	uniqueSet.add(numbers[i]);
//numbers[i].length ---> 7. So it should 0 to 6 i<length i<7(6<7)

//uniqueSet.uniqueSet.add(numbers[0]); //3 
//uniqueSet.uniqueSet.add(numbers[1]); //{3,5}
//uniqueSet.uniqueSet.add(numbers[2]); //{3,5}
//uniqueSet.uniqueSet.add(numbers[3]); {3,5}
//uniqueSet.uniqueSet.add(numbers[4]); {3,5,6}
//uniqueSet.uniqueSet.add(numbers[5]); {3,5,6,8}
//uniqueSet.uniqueSet.add(numbers[6]); {3,5,6,8,2}
}

System.out.println("The unique set values are: "+uniqueSet );
	}

}
