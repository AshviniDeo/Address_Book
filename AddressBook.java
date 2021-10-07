import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiFunction;

public class AddressBook {

	String fname;
	String lname;
	String address;
	String city;
	String state;
	String pincode;
	String phone;
	String email;

	@Override
	public String toString() {
		return "Person Details [First Name :" + fname + ", Last Name :" + lname + ", Address :" + address + ", City :"
				+ city + ", State :" + state + ", ZipCode :" + pincode + ", Phone Number :" + phone + ", Email :" + email
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBook other = (AddressBook) obj;
		return Objects.equals(fname, other.fname);

	}

	static Set<AddressBook> contact = new HashSet();
	static Map <String,AddressBook> book = new LinkedHashMap<String,AddressBook>();

	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		boolean exit = false;
		while (!exit) {
			System.out.println(" :: Welcome To AddressBook ::");
			Scanner scanner = new Scanner(System.in);
			System.out.println("  :: MENU :: ");
			System.out.println(
					" 1.Add Contact \n 2.Print Contact \n 3.Edit Contact  \n 4.Remove Contact  \n 5.Search Contact \n 6.Display AddressBook \n 7.Exit");
			System.out.println("Enter your choice : ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addContact();
				break;

			case 2:
				printContact();
				break;

			case 3:
				editContact();
				break;

			case 4:
				removeContact();
				break;

			case 5:
				searchContact();
				break;

			case 6:
				addAddressBook(contact);				
				break;

			case 7:
				exit = true;
				System.out.println("Thank You ..!!");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

	

	private static void addAddressBook( Set<AddressBook> contact) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Addressbook Name:");
		String detail = scanner.next();
		contact.forEach(a-> book.put(detail, a) );
					
		displayAddressBook(book,detail);
	}

		
	private static void displayAddressBook(Map<String, AddressBook> book,String str) {
		System.out.println(":: Address Book Index ::");
		System.out.println(str +"->" +book.get(str));	
	}

	private static void searchContact() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person Detail you want to search :");
		String detail = scanner.next();
		contact.stream().forEach(a-> {if(a.state.equalsIgnoreCase(detail) || a.city.equalsIgnoreCase(detail)) System.out.println(a);});
	//	contact.forEach(a-> {if(a.state.equalsIgnoreCase(detail) || a.city.equalsIgnoreCase(detail)) System.out.println(a);});
		

	}

	private static void removeContact() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person Name you want to delete :");
		String fname = scanner.nextLine();
		contact.forEach(a-> { if(a.fname.equals(fname)) contact.remove(a);});
		

	}

	private static void editContact() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name of Person Details you want update about:");
		String person = scanner.nextLine();
		AddressBook updatePerson = null;
		for(AddressBook per:contact) {
			if(updatePerson == null && per.fname.equals(person)) {
			updatePerson = per;
			}
		}
		boolean exit = false;
		while (!exit) {
			System.out.println(
					"Enter Details want to update : \n 1.First Name \n 2.Last Name \n 3.Address\n 4.State \n 5.City \n 6.Pincode \n 7.Phone Number \n 8.Email \n 9.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter First Name :");
				String fname = scanner.nextLine();
				updatePerson.fname = fname;
				break;

			case 2:
				System.out.println("Enter Last Name :");
				String lname = scanner.nextLine();
				updatePerson.lname = lname;
				break;

			case 3:
				System.out.println("Enter Address :");
				String addr = scanner.nextLine();
				updatePerson.address = addr;
				break;

			case 4:
				System.out.println("Enter State Name :");
				String state = scanner.nextLine();
				updatePerson.state = state;
				break;

			case 5:
				System.out.println("Enter City Name :");
				String city = scanner.next();
				updatePerson.city = city;
				break;

			case 6:
				System.out.println("Enter Pincode :");
				String zip = scanner.nextLine();
				updatePerson.pincode = zip;
				break;

			case 7:
				System.out.println("Enter Phone Number :");
				String num = scanner.nextLine();
				updatePerson.phone = num;
				break;

			case 8:
				System.out.println("Enter Email :");
				String email = scanner.nextLine();
				updatePerson.email = email;
				break;

			case 9:
				exit = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

	private static void getContact(String person) {

		for (AddressBook per : contact) {
			if (per.fname == person) {
				System.out.println(per);
			}
		}

	}

	private static void printContact() {
		for (AddressBook person : contact) {
			System.out.println(person);
		}

	}

	private static void addContact() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of person Data you want to add :");
		
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println(":: Enter Person Details ::");
			AddressBook person = new AddressBook();
			System.out.println("Enter First Name : ");
			person.fname = scanner.next();
			System.out.println("Enter Last Name : ");
			person.lname = scanner.next();
			System.out.println("Enter Address : ");
			person.address = scanner.next();
			System.out.println("Enter State Name : ");
			person.state = scanner.next();
			System.out.println("Enter City Name : ");
			person.city = scanner.next();
			System.out.println("Enter Pincode  : ");
			person.pincode = scanner.next();
			System.out.println("Enter Phone Number  : ");
			person.phone = scanner.next();
			System.out.println("Enter Email  : ");
			person.email = scanner.next();
			contact.add(person);
			
		}

	}

}
