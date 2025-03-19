package week1.day3.dailyassignments;

public class Library {

	public  String addBook(String bookTitle) {

		System.out.println("Book added successfully:"); 	
		return bookTitle;
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library callMethods = new Library();
		String bookTitle = callMethods.addBook("Java");
		String bookTitle1 = callMethods.addBook("Selenium");
		System.out.println(bookTitle1+" " +bookTitle);
		callMethods.issueBook();
		
	}

}
