import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of data you have to enter :");	
		int number = sc.nextInt();
		AddressBook obj = new AddressBook();
		
	
		
		for(int i = 0; i<number;i++ ) {
			for(int j = 0;j<number;j++) {
				System.out.println("Enter First Name :");				
				obj.setFirst_Name(obj.first_Name = sc.next());
				System.out.println("Enter Second Name:");	
				obj.setSecond_Name(obj.second_Name = sc.next());
				System.out.println("Enter Address :");	
				obj.setAddress(obj.Address = sc.next());
				System.out.println("Enter City ");	
				obj.setCity(obj.City=sc.next());
				System.out.println("Enter State :");	
				obj.setState(obj.state = sc.next());
				System.out.println("Enter Zip Code :");	
				obj.setZip_Code(obj.zip_Code = sc.nextInt());
				System.out.println("Enter phone number :");	
				obj.setPhone_Number(obj.phone_Number = sc.nextInt());
				System.out.println("Enter Email :");	
				obj.setEmail(obj.email = sc.next());
				
			}
			System.out.println();
		}
		
		for(int i = 1; i<=number; i++) {
			System.out.println(i + "." + obj.toString());
		}
	sc.close();
	}

}
