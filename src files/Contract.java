
public class Contract {
	private int contractId;
	private int contractReaEstateId;
	private int contractCustomerId;
	private int contractAgentId;
	private Date contractDate;
	public static int currentID = 1;
	
	public Contract(int contractReaEstateId, int contractCustomerId, int contractAgentId, Date contractDate) {
		this.contractId = currentID++;
		this.contractReaEstateId = contractReaEstateId;
		this.contractCustomerId = contractCustomerId;
		this.contractAgentId = contractAgentId;
		this.contractDate = contractDate;
	}

	public int getContractId() {
		return contractId;
	}


	public int getContractReaEstateId() {
		return contractReaEstateId;
	}

	public void setContractReaEstateId(int contractReaEstateId) {
		this.contractReaEstateId = contractReaEstateId;
	}

	public int getContractCustomerId() {
		return contractCustomerId;
	}

	public void setContractCustomerId(int contractCustomerId) {
		this.contractCustomerId = contractCustomerId;
	}

	public int getContractAgentId() {
		return contractAgentId;
	}

	public void setContractAgentId(int contractAgentId) {
		this.contractAgentId = contractAgentId;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public static int getCurrentID() {
		return currentID;
	}

	
	public void displayContract() {
		System.out.println(
				this.contractId + " " + 
				this.contractReaEstateId + " " + 
				this.contractCustomerId + " " + 
				this.contractAgentId + " " + 
				this.contractDate.displayDate()
				);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
