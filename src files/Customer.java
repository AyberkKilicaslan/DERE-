
public class Customer {
	private int customerId;
	private String customerName;
	private Date customerBirthdate;
	private Address customerAddress;
	private Phone customerPhone;
	private char customerGender;
	public static int currentID = 1;
	private boolean customerFlag;
	
	public Customer(String customerName, Date customerBirthdate, Address customerAddress, Phone customerPhone, char customerGender) {
		this.customerId = currentID++;
		this.customerName = customerName;
		this.customerBirthdate = customerBirthdate;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customerGender = customerGender;
		this.customerFlag = true;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getCustomerBirthdate() {
		return customerBirthdate;
	}
	public void setCustomerBirthdate(Date customerBirthdate) {
		this.customerBirthdate = customerBirthdate;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Phone getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(Phone customerPhone) {
		this.customerPhone = customerPhone;
	}
	public char getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(char customerGender) {
		this.customerGender = customerGender;
	}
	
	public boolean isCustomerFlag() {
		return customerFlag;
	}

	public void setCustomerFlag(boolean customerFlag) {
		this.customerFlag = customerFlag;
	}
	
	
	public void displayCustomer() 
	{
		System.out.println(
				this.customerId + " " +
				this.customerName + " " +
				this.customerBirthdate.displayDate() + " " +
				this.customerAddress.displayAddress() + " " +
				this.customerPhone.displayPhone() + " " +
				this.customerGender);
	}
	
}
