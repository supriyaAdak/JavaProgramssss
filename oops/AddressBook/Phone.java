package AddressBook;

public class Phone {
	private long mobileNumber;

	public long getMobileNumber() {
		return mobileNumber;
	}

	public long setMobileNumber(long mobileNumber) {
		return this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "PhoneNumber [mobileNumber=" + mobileNumber + "]";
	}

}
