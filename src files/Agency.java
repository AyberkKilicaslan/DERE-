
public class Agency {
	private int agencyID;
	private String officeName;
	private Address agencyAddress;
	private Phone agencyPhoneNumber;
	public static int currentID = 1;
	private double AgencyComission;
	private double AgencyHarm;
	
	
	public Agency( String officeName, Address agencyAddress, Phone agencyPhoneNumber )
	{
		this.agencyID = currentID++;
		this.officeName = officeName;
		this.agencyAddress = agencyAddress;
		this.agencyPhoneNumber = agencyPhoneNumber;
		this.AgencyComission = 0.0;
		this.AgencyHarm = 0.0;
	}
	
	
	public int getAgencyID() {
		return agencyID;
	}

	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public Address getAgencyAddress() {
		return agencyAddress;
	}
	public void setAgencyAddress(Address agencyAddress) {
		this.agencyAddress = agencyAddress;
	}
	public Phone getAgencyPhoneNumber() {
		return agencyPhoneNumber;
	}
	public void setAgencyPhoneNumber(Phone agencyPhoneNumber) {
		this.agencyPhoneNumber = agencyPhoneNumber;
	}
	
	public double getAgencyComission() {
		return AgencyComission;
	}

	public void setAgencyComission(double agencyComission) {
		AgencyComission = agencyComission;
	}

	public double getAgencyHarm() {
		return AgencyHarm;
	}

	public void setAgencyHarm(double agencyHarm) {
		AgencyHarm = agencyHarm;
	}

	
	public void displayAgencies() 
	{
		System.out.println(
				this.agencyID + " " +
				this.officeName + " " +
				this.agencyAddress.displayAddress() +" " +
				this.agencyPhoneNumber.displayPhone());
	}

}
