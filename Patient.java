
public class Patient {
	private String fName;
	private String mName;
	private String lName;

	private String street;
	private String city;
	private String state;

	private int zip;

	private String phoneNum;

	private String contactName;
	private String contactNum;
//constructor
	public Patient() {
	};
//constructor
	public Patient(String first, String middle, String last) {
		fName = first;
		mName = middle;
		lName = last;
	}
//overloaded constructor
	public Patient(String first, String middle, String last, String street, String city, String state, int zip,
			String phone, String contName, String contNum) {
		fName = first;
		mName = middle;
		lName = last;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		phoneNum = phone;
		contactName = contName;
		contactNum = contNum;
	}
//setter getter methods for eavh instance variable
	public String getFirstName() {
		return fName;
	}

	public void setFirstName(String fName) {
		this.fName = fName;
	}

	public String getMiddleName() {
		return mName;
	}

	public void setMiddleName(String mName) {
		this.mName = mName;
	}

	public String getLastName() {
		return lName;
	}

	public void setLastName(String lName) {
		this.lName = lName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	//concatinates strings that make up name
	public String buildFullName() {
		return (fName + " " + mName + " " + lName);
	}
//concatinates strings that make up address
	public String buildAddress() {
		return (street + ", " + city + ", " + state + " " + zip);
	}
//concatinates strings that make emergency contact
	public String buildEmergencyContact() {
		return contactName + ", " + contactNum;
	}
//overides tostring method to make it usuable
	@Override
	public String toString() {
		return "Name: " + buildFullName() + "\nAddress: " + buildAddress() + "\nEmergency Contact: "
				+ buildEmergencyContact();
	}

}
