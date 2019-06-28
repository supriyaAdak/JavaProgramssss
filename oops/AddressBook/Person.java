package AddressBook;

public class Person 
{
private String firstName;
private String lastName;
private Address address;
private Phone phonenumber;


public String toString() {
	return "PersonalDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
			+ ", phoneNumber=" + phonenumber + "]";
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


public Phone getPhonenumber() {
	return phonenumber;
}


public void setPhonenumber(Phone phonenumber) {
	this.phonenumber = phonenumber;
}


}
