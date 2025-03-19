package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {

int input1 = 121;
int output1 = input1;

for (int i=input1;i>0;i=i/10) {
	
	int rem = input1 % 10;
	
	if (rem==i) {
		
		System.out.println("The given number is palindrome");
	}
		else {
			System.out.println("The given number is not palindrome");
		}
		
	}
}
 
	}
 




