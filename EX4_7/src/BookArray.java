import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) { // book.length = 2
			System.out.print("����>>");
			String title = scanner.nextLine();
			System.out.print("����>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author);
		}
		
		for(int i=0; i<book.length; i++)
			System.out.print("("+ book[i].title + "," + book[i].author + ")");
		
		scanner.close();

	}

}
