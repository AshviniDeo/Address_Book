
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EditAddressBook {
	String firstName;
	String secondName;
	String address;
	String city;
	String state;
	int zipCode;
	int phoneNumber;
	String email;
	static Scanner sc = new Scanner(System.in);
	@Override
	public String toString() {
		return "EditAddressBook [firstName=" + getFirstName() + ", secondName=" + getSecondName() + ", address="
				+ getAddress() + ", city=" + getCity() + ", state=" + getState() + ", zipCode=" + getZipCode()
				+ ", phoneNumber=" + getPhoneNumber() + ", email=" + getEmail() + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static List<EditAddressBook> getContact() {
		return contact;
	}

	public static void setContact(List<EditAddressBook> contact) {
		EditAddressBook.contact = contact;
	}

	EditAddressBook() {
	}

	EditAddressBook(String name, String second, String addr, String c, String stat, int zip, int phone, String mail) {
		String firstName = name;
		String secondName = second;
		String address = addr;
		String city = c;
		String state = stat;
		int zipCode = zip;
		int phoneNumber = phone;
		String email = mail;

	}

	public void showDetails(List<EditAddressBook> contact) {
		for (EditAddressBook ch : contact) {
			System.out.println(ch.toString());
		}
	}

	static List<EditAddressBook> contact = new ArrayList<EditAddressBook>();
	static EditAddressBook edit = new EditAddressBook();
	public static void main(String[] args) {

		
		int choice = 0;
		String firstName;
		String secondName;
		String address;
		String city;
		String state;
		int zipCode;
		int phoneNumber;
		String email;

		while (true) {
			System.out.println("Enter number of data you want to enter :");
			int number = sc.nextInt();
			for (int i = 0; i < number; i++) {
			edit.addDetails();
			contact.add(edit);
			edit.showDetails(contact);
			}
			 System.out.println("Enter your choice you want to print data or Edit data [PRINT or EDIT or DELETE] ::");
			 String choice1 = sc.next().toUpperCase();
			 if(choice1.equals("PRINT")) {
				edit.showDetails(contact);
			 }else if(choice1.equals("EDIT")) {
				System.out.println("Enter Name from addressbook to edit :");
				String firstName1 = sc.next();
			   
			 }else if(choice1.equals("DELETE")) {
				 System.out.println("Enter Name from addressbook to delete :");
					String firstName1 = sc.next();
					if(contact.equals(firstName1)) {
						contact.remove(firstName1);
						edit.showDetails(contact);
					}
			 }

			System.out.println("You want to enter Contact Yes or No as [1 or 2] :: ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter number of data you want to enter :");
				number = sc.nextInt();
			} else {
				break;
			}
			

		}

	}

	private void editDetails(String firstName1) {
		if (contact.equals(firstName1)) {
			showDetails(contact);
			addDetails();
		}
		
	}

	private EditAddressBook addDetails() {
		System.out.println("Enter First Name :");
		firstName = sc.next();
		System.out.println("Enter Second Name:");
		secondName = sc.next();
		System.out.println("Enter Address :");
		address = sc.next();
		System.out.println("Enter City ");
		city = sc.next();
		System.out.println("Enter State :");
		state = sc.next();
		System.out.println("Enter Zip Code :");
		zipCode = sc.nextInt();
		System.out.println("Enter phone number :");
		phoneNumber = sc.nextInt();
		System.out.println("Enter Email :");
		email = sc.next();
		edit.setFirstName(firstName);
		edit.setSecondName(secondName);
		edit.setAddress(address);
		edit.setCity(city);
		edit.setState(state);
		edit.setZipCode(zipCode);
		edit.setPhoneNumber(phoneNumber);
		edit.setEmail(email);
		EditAddressBook edit = new EditAddressBook(firstName,secondName,address,city,state,zipCode,phoneNumber,email);
		return edit;
	}

	

	
}
