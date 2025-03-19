package week1.day3.dailyassignments;

public class LibraryManagement {

	public static void main(String[] args) {

		Library callFromAnotherClass = new Library();
		callFromAnotherClass.addBook("DotNet");
		callFromAnotherClass.issueBook();
		System.out.println("Called from another class");
	}

}
