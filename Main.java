import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main myObj = new Main();
		myObj.addData();
	}

	Scanner sc = new Scanner(System.in);
	AddressBook book = new AddressBook();
	List<AddressBook> myObj = new ArrayList<AddressBook>();
	private void addData() {		
		System.out.println("Enter number of data you have to enter :");
		int number = sc.nextInt();
	
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				
				System.out.println("Enter First Name :");
				book.setFirst_Name(book.first_Name = sc.next());
				System.out.println("Enter Second Name:");
				book.setSecond_Name(book.second_Name = sc.next());
				System.out.println("Enter Address :");
				book.setAddress(book.Address = sc.next());
				System.out.println("Enter City ");
				book.setCity(book.City = sc.next());
				System.out.println("Enter State :");
				book.setState(book.state = sc.next());
				System.out.println("Enter Zip Code :");
				book.setZip_Code(book.zip_Code = sc.nextInt());
				System.out.println("Enter phone number :");
				book.setPhone_Number(book.phone_Number = sc.nextInt());
				System.out.println("Enter Email :");
				book.setEmail(book.email = sc.next());
				myObj.add(book);
			}
			System.out.println();
		}
		for (AddressBook list: myObj) {
			myObj.toString();
			
		}
	 
   	}
}


