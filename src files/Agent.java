
public class Agent
{
	private int agentID;
	private int agentWorksAgency;
	private String agentName;
	private Date agentBirthDate;
	private Address agentAddress;
	private Phone agentPhoneNumber;
	private char agentGender;
	public double agentSalary;
	public static int currentID = 1;
	private boolean agentFlag;
	private double AgentComission;
	
	public Agent(int agentWorksAgency, String agentName, Date agentBirthDate, Address agentAddress, Phone agentPhoneNumber, char agentGender) 
	{
		this.agentID = currentID++;
		this.agentWorksAgency = agentWorksAgency;
		this.agentName = agentName;
		this.agentBirthDate = agentBirthDate;
		this.agentAddress = agentAddress;
		this.agentPhoneNumber = agentPhoneNumber;
		this.agentGender = agentGender;
		this.agentSalary = 2000.0;
		this.agentFlag = true;
		this.AgentComission = 0.0;
	}


	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentWorksAgency() {
		return agentWorksAgency;
	}

	public void setAgentWorksAgency(int agentWorksAgency) {
		this.agentWorksAgency = agentWorksAgency;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Date getAgentBirthDate() {
		return agentBirthDate;
	}

	public void setAgentBirthDate(Date agentBirthDate) {
		this.agentBirthDate = agentBirthDate;
	}

	public Address getAgentAddress() {
		return agentAddress;
	}

	public void setAgentAddress(Address agentAddress) {
		this.agentAddress = agentAddress;
	}

	public Phone getAgentPhoneNumber() {
		return agentPhoneNumber;
	}

	public void setAgentPhoneNumber(Phone agentPhoneNumber) {
		this.agentPhoneNumber = agentPhoneNumber;
	}

	public char getAgentGender() {
		return agentGender;
	}

	public void setAgentGender(char agentGender) {
		this.agentGender = agentGender;
	}
	
	public double getAgentSalary() {
		return agentSalary;
	}

	public void setAgentSalary(double agentSalary) {
		this.agentSalary = agentSalary;
	}

	public boolean isAgentFlag() {
		return agentFlag;
	}
	public void setAgentFlag(boolean agentFlag) {
		this.agentFlag = agentFlag;
	}
	
	public double getAgentComission() {
		return AgentComission;
	}
	
	public void setAgentComission(double agentComission) {
		AgentComission = agentComission;
	}



	public void displayAgents() {
		System.out.println(this.agentID + " " +
		this.agentWorksAgency + " " +
		this.agentName + " " +
		this.agentBirthDate.displayDate() + " " +
		this.agentAddress.displayAddress() + " " +
		this.agentPhoneNumber.displayPhone() + " " +
		this.agentGender + " " + 
		this.getAgentSalary()
		
				);

	}

	
	
	
}
