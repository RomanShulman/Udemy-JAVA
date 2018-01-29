
public class Student7_1 
{
	private String firstName;
	private String lastName;
	private String birthDate;
	private String address;
	private String phoneNumber;
	private String email;
	private int studentID;
	private double gpa1;
	private double gpa2;
	
	public Student7_1()
	{
		super();
		this.firstName = "";
		this.lastName = "";
		this.birthDate = "";
		this.address = "";
		this.phoneNumber = "";
		this.email = "";
		this.studentID = 0;
		this.gpa1 = 0.0;
		this.gpa2 = 0.0;
	}
	
	public Student7_1(String firstName, String lastName, String birthDate, String address, String phoneNumber,
			String email, int studentID, double gpa1, double gpa2) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.studentID = studentID;
		this.gpa1 = gpa1;
		this.gpa2 = gpa2;
	}
	
	public void enroll(String firstName, String lastName, String birthDate, String address, String phoneNumber,
			String email, int studentID, double gpa1, double gpa2) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.studentID = studentID;
		this.gpa1 = gpa1;
		this.gpa2 = gpa2;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public double getGpa1() {
		return gpa1;
	}

	public void setGpa1(double gpa1) {
		this.gpa1 = gpa1;
	}

	public double getGpa2() {
		return gpa2;
	}

	public void setGpa2(double gpa2) {
		this.gpa2 = gpa2;
	}
	
	
	public double gpa() 
	{
		return ((this.gpa1 + this.gpa2)/2);
	}
	
	public boolean isValidID()
	{
		if (this.studentID >= 10000 && this.studentID <99999)
			return true;
		else
			return false;
	}
	
	public void studentInfo()
	{
		System.out.println(firstName + " " + lastName + ", " + birthDate + ", lives at: " + address + ", phone: " 
	                       + phoneNumber + ", email: " + email + ", ID: " + studentID + ", GPA1: " + gpa1 + ", GPA2: " + gpa2);
	}
	
	
}
