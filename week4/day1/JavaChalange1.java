package week4.day1;

public class JavaChalange1 {

	public static void main(String[] args) {
/*
 * Given a string s consisting of words and spaces, return the length of the 
 * last word in the string.
*A word is a maximal substring consisting of non-space characters only.
*Example 1: 
*Input: s = "Hello World"
*Output: 5
*Explanation: The last word is "World" with length 5.
*Example 2: Input: s = "   fly me   to   the moon  "
*Output: 4
*Explanation: The last word is "moon" with length 4.
 */
	
String S = "Hello World to the fly";
int length = 0;
//S = S.trim();
//i=9;9>0
//ch = S.charAt(8)
//if
for (int i =S.length()-1 ; i > 0; i--)
{
	char ch = S.charAt(i);
	if(ch == ' '){
	break;
}
	else {
		
		length++;
	}
}	
	System.out.println("Length is: "+ length);

	
	
	
	}

}
