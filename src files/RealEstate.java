
public class RealEstate
{
	private int realEstateId;
	private String realEstateType;
	private String realEstateStatus;//For rent or for sale
	private boolean realEstateAvailability;  //Is it sold/rented or not (False Sold or Rented)
	private Address realEstateAdress;
	private short realEstateSurfaceArea;
	private double realEstatePrice;
	private short realEstateOfRooms;
	public static int currentID = 1;
	private boolean realEstateFlag;//Is it deleted or is not it deleted
	
	public RealEstate(String realEstateType, String realEstateStatus, Address realEstateAdress, short realEstateSurfaceArea, double realEstatePrice, short realEstateOfRooms) 
	{
		this.realEstateId = currentID++;
		this.realEstateType = realEstateType;
		this.realEstateStatus = realEstateStatus;
		this.realEstateAvailability = true; 
		this.realEstateAdress = realEstateAdress;
		this.realEstateSurfaceArea = realEstateSurfaceArea;
		this.realEstatePrice = realEstatePrice;
		this.realEstateOfRooms = realEstateOfRooms;
		this.realEstateFlag = true;
	}
	
	
	public int getRealEstateId() {
		return realEstateId;
	}
	
	public void setRealEstateId(int realEstateId) {
		this.realEstateId = realEstateId;
	}

	public String getRealEstateType() {
		return realEstateType;
	}

	public void setRealEstateType(String realEstateType) {
		this.realEstateType = realEstateType;
	}

	public String getRealEstateStatus() {
		return realEstateStatus;
	}

	public boolean isRealEstateAvailability() {
		return realEstateAvailability;
	}
	
	public void setRealEstateAvailability(boolean realEstateAvailability) {
		this.realEstateAvailability = realEstateAvailability;
	}
	
	public void setRealEstateStatus(String realEstateStatus) {
		this.realEstateStatus = realEstateStatus;
	}

	public Address getRealEstateAdress() {
		return realEstateAdress;
	}

	public void setRealEstateAdress(Address realEstateAdress) {
		this.realEstateAdress = realEstateAdress;
	}

	public short getRealEstateSurfaceArea() {
		return realEstateSurfaceArea;
	}

	public void setRealEstateSurfaceArea(short realEstateSurfaceArea) {
		this.realEstateSurfaceArea = realEstateSurfaceArea;
	}

	public double getRealEstatePrice() {
		return realEstatePrice;
	}

	public void setRealEstatePrice(double realEstatePrice) {
		this.realEstatePrice = realEstatePrice;
	}

	public short getRealEstateOfRooms() {
		return realEstateOfRooms;
	}

	public void setRealEstateOfRooms(short realEstateOfRooms) {
		this.realEstateOfRooms = realEstateOfRooms;
	}
	
	

	public boolean isRealEstateFlag() {
		return realEstateFlag;
	}


	public void setRealEstateFlag(boolean realEstateFlag) {
		this.realEstateFlag = realEstateFlag;
	}


	public void displayRealEstate() 
	{
		System.out.println(this.realEstateId + " " +
				this.realEstateType + " "  +
				this.realEstateStatus + " " +
				this.realEstateAdress.displayAddress() + " " +
				this.realEstateSurfaceArea + " " +
				this.realEstatePrice + " " +
				this.realEstateOfRooms);
	}
	
	

}
