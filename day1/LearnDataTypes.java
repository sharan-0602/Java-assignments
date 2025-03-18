package week1.day1;

public class LearnDataTypes {

	public static void main(String[] args) {

		// Variables Only single word with lower case:
		//If we need multipleword Camelcase should be use. Ex : ageOfPerson
	//	ExAge is 30. I need a variable to store the data 30. So I need a variable (Age) to store the data 30.
		
		//int age = 30;
		
		//Byte Data Type
		byte age = 30;
		System.out.println(age);
		//Short Data Type
		short ageOfPerson = 128;
		int depositAmount = 50000;
		long mobileNumber = 9952244300L;//can use both 'L' OR 'l'
		
		//float
		float rateOfInterest = 7.45f; //can use both 'F' OR 'f'
		System.out.println(rateOfInterest);

		
		//double
		
		double rupee = 0.0057555955098; //can use both 'D' OR 'd'
		
		System.out.println(rupee);
		System.out.println(mobileNumber);

		//Char --> It's been a single character
		
		char logoOfTestLeaf = 'T';
		System.out.println(logoOfTestLeaf);
		
		//boolean --> It's only True/False
		
		boolean haveBreakfast = false;
		System.out.println(haveBreakfast);
		
		//string --> Non-primitive data type and it has a predefined class in java
		String name = "Saranya";
		System.out.println(name+" "+age);
		
		
	}

}
