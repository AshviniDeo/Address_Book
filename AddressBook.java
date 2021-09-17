
public class AddressBook {
    String first_Name;
    String second_Name;
    String Address;
    String City;
    String state;
    int zip_Code;
    int phone_Number;
    String email;

  
    public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getSecond_Name() {
		return second_Name;
	}
	public void setSecond_Name(String second_Name) {
		this.second_Name = second_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip_Code() {
		return zip_Code;
	}
	public void setZip_Code(int zip_Code) {
		this.zip_Code = zip_Code;

	  
	}
	public int getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(int phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AddressBook [first_Name=" + first_Name + ", second_Name=" + second_Name + ", Address=" + Address
				+ ", City=" + City + ", state=" + state + ", zip_Code=" + zip_Code + ", phone_Number=" + phone_Number
				+ ", email=" + email + ", getFirst_Name()=" + getFirst_Name() + ", getSecond_Name()=" + getSecond_Name()
				+ ", getAddress()=" + getAddress() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getZip_Code()=" + getZip_Code() + ", getPhone_Number()=" + getPhone_Number() + ", getEmail()="
				+ getEmail() + "]";
	}
	
	
	



}