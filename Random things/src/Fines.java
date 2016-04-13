/**
 * This program displays the accumulated fine from a late book
 * 
 * @author (Luis Hernandez) 
 * @version (10/5/2014)
 */
import java.util.Scanner;
public class Fines
{
	public static void main(String []args)
	{
		//User information input
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter name (Last, First) and social security (###-##-####): ");
		String lastName = in.next();
		String firstName = in.next();
		String socialSecurity = in.next();
		String userData = lastName + " " + firstName;
		lastName = lastName.replace(",", "");
		int lastNameLength = lastName.length();
		System.out.println();

		//Book data input
		System.out.print("Please enter book title: ");
		String firstToken2 = in.next();
		String bookTitle = in.nextLine();
		bookTitle = firstToken2 + bookTitle;
		System.out.println();

		//Check out date input
		System.out.print("Please enter the check out date (mm/dd/yyyy): ");
		String checkOutDate = in.next();
		System.out.print("Days late: ");
		int daysLate = in.nextInt();
		System.out.println();

		//Daily fine
		System.out.print("Please enter the daily fine: ");
		double fine = in.nextDouble();
		System.out.println();

		//Late fee
		double lateFee = daysLate * fine;
		System.out.println("Your late fee is: " + "$" + lateFee);
		System.out.println();

		//Email form (Header)
		System.out.print("To: " + userData + "\t \t \t Account: " + lastName.substring(0,lastNameLength) + 
		socialSecurity.substring(7,11) + "\nFrom: Media Center\nSubject: Overdue late fees\n----------------------------------------------------------\n");
		
		//Email form (Body)
		System.out.print(bookTitle + " was checked out on " + checkOutDate + ".\nThis book is currently "
		+ daysLate + " days late.\nYour fine has accumulated to $" + lateFee + ".\nPlease return you book and pay the late fee at the media center.\nBlack");
	}
}