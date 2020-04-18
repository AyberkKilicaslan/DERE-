import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Methods
{
	
	Agency[] agencyArray = new Agency[65565];
    Agent[] agentArray = new Agent[65565];
    RealEstate[] realEstateArray = new RealEstate[65565];
    Customer[] customerArray = new Customer[65565];
    Contract[] contractArray = new Contract[65565];
	
    
    
    //Read User Input
  	public void userInput() throws IOException 
  	{
  		try {  
  			Scanner sc = new Scanner(System.in);
  			String[] splittedLine = sc.nextLine().split(";", -1);
  			
  			
  			if ( splittedLine[0].equalsIgnoreCase("load") )
  	    	{
  				ReadFile("input.txt");
  	    	}
  			
  	    	if ( splittedLine[0].equalsIgnoreCase("addAgency") || splittedLine[0].equalsIgnoreCase("addAgent") || splittedLine[0].equalsIgnoreCase("addRealEstate") ||splittedLine[0].equalsIgnoreCase("addCustomer") || splittedLine[0].equals("addContract") )
  	    	{
  	    		//If input is "Bayan", convert to "Kadýn"
  	    		if (splittedLine[0].equalsIgnoreCase("addAgent"))
  	    			splittedLine[8] = "Kadýn";
  	    		else if (splittedLine[0].equalsIgnoreCase("addCustomer"))
  	    			splittedLine[7] = "Kadýn";
  	    		
  	    		AddFunction(splittedLine);
  	    		
  	    		System.out.println("Yes sir! Your input has added!");
  	    	}
  	    	else if ( splittedLine[0].equalsIgnoreCase("displayAgencies") || splittedLine[0].equalsIgnoreCase("displayAgents") || splittedLine[0].equalsIgnoreCase("displayRealEstates") || splittedLine[0].equalsIgnoreCase("displayCustomers") || splittedLine[0].equals("displayContracts") )
  	    	{
  	    		System.out.println("\n----------" + splittedLine[0] + "----------");
  	    		DisplayFunction(splittedLine[0]);
  	    		
  	    	}
  	    	else if(splittedLine[0].equalsIgnoreCase("deleteAgent") || splittedLine[0].equalsIgnoreCase("deleteRealEstate") || splittedLine[0].equalsIgnoreCase("deleteCustomer"))
  	    	{
  	    		System.out.println("\n");
  	    		DeleteFunction(splittedLine[0],Integer.parseInt(splittedLine[1])); 
  	    		System.out.println("Yes sir! Your input has deleted!");
  	    	}
  	    	else if (splittedLine[0].equalsIgnoreCase("search"))
  	    	{
  	    		System.out.println("\n----------Search----------");
  	    		SearchFunction(splittedLine);
  	    	}
  	    	else if (splittedLine[0].equalsIgnoreCase("calculateSalaries"))
  	    	{
  	    		System.out.println("\n----------calculateSalaries----------");
  	    		CalculateSalariesFunction(splittedLine);
  	    	}
  	    	else if (splittedLine[0].equalsIgnoreCase("calculateTotalIncome"))
  	    	{
  	    		System.out.println("\n----------calculateTotalIncome----------");
  	    		calculateTotalIncomeFunction(splittedLine);
  	    	}
  	    	else if (splittedLine[0].equalsIgnoreCase("mostProfitableAgency"))
  	    	{
  	    		System.out.println("\n----------mostProfitableAgency----------");
  	    		mostProfitableAgencyFunction(splittedLine);
  	    	}
  	    	else if (splittedLine[0].equalsIgnoreCase("agentOfTheMonth"))
  	    	{
  	    		System.out.println("\n----------agentOfTheMonth----------");
  	    		agentOfTheMonthFunction(splittedLine);
  	    	}
  	    	else if ( splittedLine[0].equalsIgnoreCase("help") )
  	    	{
  				HelpFunction(splittedLine);
  	    	}
  	    	if ( splittedLine[0].equalsIgnoreCase("exit") )
  	    	{
  	    		System.out.println("Exiting...");
  	    		System.exit(0);
  	    	}
  	    	
  	    	userInput();    
  		}
  	    catch(Exception e)
  	    {
  	    	 System.out.println("Error, I could not read your text!!!" + e.getMessage());
  	    }
  		 
  	}
  	
	//Read File
	public void ReadFile(String fileName) throws IOException 
	{
		 	//To Read File
	    		BufferedReader br = new BufferedReader(new FileReader(fileName));
	    	    String line;
	 try {   
	    	    
    	    //Line By Line
    	    while ((line = br.readLine()) != null)
    	    {
    	    	
    	    	String[] splittedLine = line.split(";", -1);
    	    	
    	    	
    	    	if ( splittedLine[0].equals("addAgency") || splittedLine[0].equals("addAgent") || splittedLine[0].equals("addRealEstate") ||splittedLine[0].equals("addCustomer") || splittedLine[0].equals("addContract") )
    	    	{
    	    		if (splittedLine[0].equals("addAgent"))
    	    			splittedLine[8] = "Kadýn";
    	    		else if (splittedLine[0].equalsIgnoreCase("addCustomer"))
      	    			splittedLine[7] = "Kadýn";
    	    			
    	    		AddFunction(splittedLine);
    	    	}
    	    	else if ( splittedLine[0].equals("displayAgencies") || splittedLine[0].equals("displayAgents") || splittedLine[0].equals("displayRealEstates") || splittedLine[0].equals("displayCustomers") || splittedLine[0].equals("displayContracts") )
    	    	{
    	    		System.out.println("\n----------" + splittedLine[0] + "----------");
    	    		DisplayFunction(splittedLine[0]);
    	    	}
    	    	else if(splittedLine[0].equals("deleteAgent") || splittedLine[0].equals("deleteRealEstate") || splittedLine[0].equals("deleteCustomer"))
    	    	{
    	    		System.out.println("\n");
    	    		DeleteFunction(splittedLine[0],Integer.parseInt(splittedLine[1]));  	    	
    	    	}
    	    	else if (splittedLine[0].equals("search"))
		    	{
    	    		System.out.println("\n----------Search----------");
    	    		SearchFunction(splittedLine);
    	    	}
    	    	else if (splittedLine[0].equals("calculateSalaries"))
		    	{
    	    		System.out.println("\n----------calculateSalaries----------");
    	    		CalculateSalariesFunction(splittedLine);
    	    	}
    	    	else if (splittedLine[0].equals("calculateTotalIncome"))
		    	{
    	    		System.out.println("\n----------calculateTotalIncome----------");
    	    		calculateTotalIncomeFunction(splittedLine);
    	    	}
    	    	else if (splittedLine[0].equals("mostProfitableAgency"))
		    	{
    	    		System.out.println("\n----------mostProfitableAgency----------");
    	    		mostProfitableAgencyFunction(splittedLine);
    	    	}
    	    	else if (splittedLine[0].equals("agentOfTheMonth"))
		    	{
    	    		System.out.println("\n----------agentOfTheMonth----------");
    	    		agentOfTheMonthFunction(splittedLine);
    	    	}
    	    } 
    	    
    	    userInput();
	    	    
		}
	    catch(Exception e)
	    {
	    	 System.out.println("File could not find!!!!!" + e.getMessage());
	    }
		 
	}

	//Add Function
	public void AddFunction(String[] splittedLine) 
	{
		
		if (splittedLine[0].equals("addAgency")) 
		{
			Address address = new Address(splittedLine[2],splittedLine[3],splittedLine[4]);
			
			String areaCode = splittedLine[5].substring(0, 4);
			String phoneNumber = splittedLine[5].substring(5, 11);
			Phone phone = new Phone(areaCode, phoneNumber);
			
			agencyArray[Agency.currentID] = new Agency(splittedLine[1], address, phone);
		}
		
		
		else if (splittedLine[0].equals("addAgent"))
		{
			int d = Integer.parseInt(splittedLine[3].substring(0, 2));
			int m = Integer.parseInt(splittedLine[3].substring(3, 5));
			int y = Integer.parseInt(splittedLine[3].substring(6, 10));
			Date date = new Date(d,m,y);
			
			Address address = new Address(splittedLine[4],splittedLine[5],splittedLine[6]);
			
			String areaCode = splittedLine[7].substring(0, 4);
			String phoneNumber = splittedLine[7].substring(5, 11);
			Phone phone = new Phone(areaCode, phoneNumber);
			
			//If date not wrong, add
			if(date.getDay() != 0)
				agentArray[Agent.currentID] = new Agent(Integer.parseInt(splittedLine[1]), splittedLine[2], date, address, phone, splittedLine[8].charAt(0));

		}
		else if (splittedLine[0].equals("addRealEstate"))
		{
			
			Address address = new Address(splittedLine[3],splittedLine[4],splittedLine[5]);
			
    		realEstateArray[RealEstate.currentID] = new RealEstate(splittedLine[1], splittedLine[2], address, Short.parseShort(splittedLine[6]), Long.parseLong(splittedLine[7]), Short.parseShort(splittedLine[8]));
		}
		else if (splittedLine[0].equals("addCustomer"))
		{
			int d = Integer.parseInt(splittedLine[2].substring(0, 2));
			int m = Integer.parseInt(splittedLine[2].substring(3, 5));
			int y = Integer.parseInt(splittedLine[2].substring(6, 10));
			Date date = new Date(d,m,y);
			
			Address address = new Address(splittedLine[3],splittedLine[4],splittedLine[5]);
			
			String areaCode = splittedLine[6].substring(0, 4);
			String phoneNumber = splittedLine[6].substring(5, 11);
			Phone phone = new Phone(areaCode, phoneNumber);
			
			//If date not wrong, add
			if(date.getDay() != 0)
    		customerArray[Customer.currentID] = new Customer(splittedLine[1], date, address, phone, splittedLine[7].charAt(0));
			
		}
		
		else if (splittedLine[0].equals("addContract"))
		{
			int d = Integer.parseInt(splittedLine[4].substring(0, 2));
			int m = Integer.parseInt(splittedLine[4].substring(3, 5));
			int y = Integer.parseInt(splittedLine[4].substring(6, 10));
			Date date = new Date(d,m,y);
			
			//If date not wrong, add
			if(date.getDay() != 0  && realEstateArray[Integer.parseInt(splittedLine[1])] != null && realEstateArray[Integer.parseInt(splittedLine[1])].isRealEstateAvailability() == true 
					&& customerArray[Integer.parseInt(splittedLine[2])] != null && agentArray[Integer.parseInt(splittedLine[3])] != null )
			{
				contractArray[Contract.currentID] = new Contract(Integer.parseInt(splittedLine[1]), Integer.parseInt(splittedLine[2]), Integer.parseInt(splittedLine[3]), date);
				
				realEstateArray[Integer.parseInt(splittedLine[1])].setRealEstateAvailability(false);
				
			}
		}
	}	
		
	//Display Function
	public void DisplayFunction(String Input) 
	{
		
		if (Input.equals("displayAgencies"))
		{
			for (int i = 1; i < agencyArray.length; i++)
			{
				if (agencyArray[i]==null)
					break;
				
				agencyArray[i].displayAgencies();
			}
		}
		
		else if (Input.equals("displayAgents"))
		{
			
			
			for (int i = 1; i < agentArray.length; i++)
			{
				if (agentArray[i]==null)
					break;

				if(agentArray[i].isAgentFlag()== true)
					agentArray[i].displayAgents();
			}
		}
		
		else if (Input.equals("displayRealEstates"))
		{
			for (int i = 1; i < realEstateArray.length; i++)
				
			{
				if(realEstateArray[i]== null)
					break;
				
				if(realEstateArray[i].isRealEstateFlag() == true)
					realEstateArray[i].displayRealEstate();
			}
		}
		
		else if (Input.equals("displayCustomers"))
		{
			for (int i = 1; i < customerArray.length; i++)
				{
					if (customerArray[i]==null)
						break;
					
					if(customerArray[i].isCustomerFlag() == true)
						customerArray[i].displayCustomer();
				}
		}
		
		else if (Input.equals("displayContracts"))
		{
			for (int i = 1; i < contractArray.length; i++)
				{
					if (contractArray[i]==null)
						break;
					
					contractArray[i].displayContract();
				}
		}
	
	}	
	
	//Delete Function
	public void DeleteFunction(String Input , int Id)
	{
		if(agentArray[Id] != null)
		{
			if(Input.equals("deleteAgent"))
			{
				System.out.println("Agent Deleted!");
				agentArray[Id].setAgentFlag(false);
			}
			if(Input.equals("deleteRealEstate"))
			{
				System.out.println("Real Estate Deleted!");
				realEstateArray[Id].setRealEstateFlag(false);
			}
			if(Input.equals("deleteCustomer"))
			{
				System.out.println("Customer Deleted!");
				customerArray[Id].setCustomerFlag(false);
			}
		}
	}
	
	//Search Function
	public void SearchFunction(String[] splittedLine)
	{	
		
		for (int i = 1; i < realEstateArray.length; i++)
		{
			
			//If there is no other realEstate
			if (realEstateArray[i] == null)
				break;
			
			String[] splittedSurfaceArea = new String[2];
			String[] splittedPriceRange = new String[2];
			String[] splittedRooms = new String[2];
			
			//If Surface Area enter separate it, Else not separate direct look all Surface Area
			if (!splittedLine[5].equals("")) 
				splittedSurfaceArea = splittedLine[5].split("-");
			
			//If Price enter separate it, Else not separate direct look all Price
			if (!splittedLine[6].equals("")) 
				splittedPriceRange = splittedLine[6].split("-");
			
			//If rooms enter separate it, Else not separate direct look all rooms
			if (!splittedLine[7].equals("")) 
				splittedRooms = splittedLine[7].split("-");
			
			//If conditions suitable, please list :)
			if( (splittedLine[1].equals("")	||	splittedLine[1].equals(realEstateArray[i].getRealEstateType()))				&& 
				(splittedLine[2].equals("") ||	splittedLine[2].equals(realEstateArray[i].getRealEstateStatus()))			&&
				(splittedLine[3].equals("") ||	splittedLine[3].equals(realEstateArray[i].getRealEstateAdress().getTown())) &&
				(splittedLine[4].equals("") ||	splittedLine[4].equals(realEstateArray[i].getRealEstateAdress().getCity()))	&&	
				(splittedLine[5].equals("") ||	(realEstateArray[i].getRealEstateSurfaceArea() >= Integer.parseInt(splittedSurfaceArea[0]) 	&&	realEstateArray[i].getRealEstateSurfaceArea() <= Integer.parseInt(splittedSurfaceArea[1])) ) &&
				(splittedLine[6].equals("") ||	(realEstateArray[i].getRealEstatePrice() >= Integer.parseInt(splittedPriceRange[0])	&&	realEstateArray[i].getRealEstatePrice()	 <= Integer.parseInt(splittedPriceRange[1]))) &&
				(splittedLine[7].equals("") ||	(realEstateArray[i].getRealEstateOfRooms() >= Integer.parseInt(splittedRooms[0]) 	&&	realEstateArray[i].getRealEstateOfRooms() <=Integer.parseInt(splittedRooms[1])))
			  )
				
				{
						realEstateArray[i].displayRealEstate();
				}
				
		}
		
		
	}
	
	//Salary Calculator
	public void SalaryCalculatorFunction(String[] splittedLine)
	{
		String[] monthYear = new String[2];
		
		if (!splittedLine[1].equals("")) 
			monthYear = splittedLine[1].split("/");
		
		//Look all contract, If date match, calculate comission and update agent
		for (int i = 1; i < contractArray.length; i++) 
		{
			
			if (contractArray[i]==null)
				break;
			
			if ( contractArray[i].getContractDate().getMonth() == Integer.parseInt(monthYear[0]) && contractArray[i].getContractDate().getYear() == Integer.parseInt(monthYear[1]) ) 
			{
				double agentOldComission = agentArray[contractArray[i].getContractAgentId()].getAgentComission();
				double agentIncreaseComission = 0.0;
				
				double agencyOldComission = agencyArray[agentArray[contractArray[i].getContractAgentId()].getAgentWorksAgency()].getAgencyComission();
				double agencyIncreaseComission = 0.0;
				
				if (realEstateArray[contractArray[i].getContractReaEstateId()].getRealEstateStatus().equalsIgnoreCase("For Rent"))
				{
					agentIncreaseComission = realEstateArray[contractArray[i].getContractReaEstateId()].getRealEstatePrice() * 20.0 / 100.0;
					agencyIncreaseComission = realEstateArray[contractArray[i].getContractReaEstateId()].getRealEstatePrice() * 80.0 / 100.0;
				}
				else if (realEstateArray[contractArray[i].getContractReaEstateId()].getRealEstateStatus().equalsIgnoreCase("For Sale")) 
				{
					agentIncreaseComission = realEstateArray[contractArray[i].getContractReaEstateId()].getRealEstatePrice() * 5.0 / 1000.0;
					agencyIncreaseComission = realEstateArray[contractArray[i].getContractReaEstateId()].getRealEstatePrice() * 15.0 / 1000.0;
				}
				
				double agentNewComission = agentOldComission + agentIncreaseComission;
				double agencyNewComission = agencyOldComission + agencyIncreaseComission;
				
				if(agentArray[contractArray[i].getContractAgentId()].isAgentFlag()== true)
					agentArray[contractArray[i].getContractAgentId()].setAgentComission(agentNewComission);
				
				agencyArray[agentArray[contractArray[i].getContractAgentId()].getAgentWorksAgency()].setAgencyComission(agencyNewComission);
				
				
			}
		}
	}
	
	//Reset Salary Calculator
	public void SalaryCalculatorResetFunction()
	{
		for (int i = 1; i < agentArray.length; i++) 
		{
			if (agentArray[i]==null)
				break;
			
			agentArray[i].setAgentComission(0.0);
		}

		for (int i = 1; i < agencyArray.length; i++) 
		{
			if (agencyArray[i]==null)
				break;
			
			agencyArray[i].setAgencyComission(0.0);
			agencyArray[i].setAgencyHarm(0.0);
		}
	}
	
	//Calculate Salaries Function
	public void CalculateSalariesFunction(String[] splittedLine)
	{
		SalaryCalculatorFunction(splittedLine);
		
		//Write Agent Salary
		for (int i = 1; i < agentArray.length; i++) 
		{
			if (agentArray[i]==null)
				break;
			
			double agentTotalSalary = agentArray[i].getAgentSalary() + agentArray[i].getAgentComission();
			
			if(agentArray[i].isAgentFlag())
				System.out.println(agentArray[i].getAgentID()  + " " + agentArray[i].getAgentName() + " " +  " " + agentTotalSalary + " TL" );
		}
		
		SalaryCalculatorResetFunction();
	}
	
	//Calculate Total Income Function
	public void calculateTotalIncomeFunction(String[] splittedLine)
	{
		SalaryCalculatorFunction(splittedLine);
		
		//Write Total Income
		for (int i = 1; i < agencyArray.length; i++) 
		{
			if (agencyArray[i]==null)
				break;
			
			System.out.println(agencyArray[i].getAgencyID() + " "  + agencyArray[i].getOfficeName() + " " + agencyArray[i].getAgencyComission() + " TL");
		}
				
		SalaryCalculatorResetFunction();
	}
		
	//Most Profitable Agency Function
	public void mostProfitableAgencyFunction(String[] splittedLine)
	{
		SalaryCalculatorFunction(splittedLine);

		//To Calculate Total Harm
		for (int i = 1; i < agentArray.length; i++) 
		{
			if (agentArray[i] == null)
				break;
			
			
			double AgencyOldHarm = agencyArray[agentArray[i].getAgentWorksAgency()].getAgencyHarm();
			agencyArray[agentArray[i].getAgentWorksAgency()].setAgencyHarm(AgencyOldHarm + agentArray[i].getAgentSalary());
		}
		
		
		int mostProfitableAgencyId = 0;  
		double mostProfitableAgencyPrice = 0;
		
		//Write Total Income
		for (int i = 1; i < agencyArray.length; i++) 
		{
			if (agencyArray[i]==null)
				break;
			
			double agencyPrice = agencyArray[i].getAgencyComission() - agencyArray[i].getAgencyHarm();
			
			
			if (agencyPrice > mostProfitableAgencyPrice ) 
			{
				mostProfitableAgencyId = agencyArray[i].getAgencyID();
				mostProfitableAgencyPrice = agencyPrice;
			}
			
		}
		
		System.out.println(agencyArray[mostProfitableAgencyId].getAgencyID() + " " + agencyArray[mostProfitableAgencyId].getOfficeName() + " " + mostProfitableAgencyPrice);
		
		SalaryCalculatorResetFunction();
	}
	
	//Agent of The Month Function
	public void agentOfTheMonthFunction(String[] splittedLine)
	{
		SalaryCalculatorFunction(splittedLine);
		
		double highestSalaryofAgent = 0.0;
		int highestSalaryofAgentId = 0;
		
		for (int i = 1; i < agentArray.length; i++) 
		{
			if (agentArray[i]==null)
				break;
			
			double tempSalary = agentArray[i].getAgentComission() + agentArray[i].getAgentSalary();
			
			if (tempSalary > highestSalaryofAgent) 
			{
				highestSalaryofAgent = tempSalary;
				highestSalaryofAgentId = agentArray[i].getAgentID();
			}
		}
		
		System.out.println(agentArray[highestSalaryofAgentId].getAgentID() + " " + agentArray[highestSalaryofAgentId].getAgentName() + " " + highestSalaryofAgent);

		
		SalaryCalculatorResetFunction();
	}
	
	//Agent of The Month Function
	public void HelpFunction(String[] splittedLine) 
	{
		System.out.println(
				">load;input.txt\r\n\n" + 
				">addAgency;name;address;town;city;phone\r\n" + 
				">addAgent;agency_id;name;birthdate;address;town;city;phone;gender\r\n" + 
				">addRealEstate;type;status;address;town;city;surface_area;price;#_of_rooms\r\n" + 
				">addCustomer;name;birthdate;address;town;city;phone;gender\r\n" + 
				">addContract;real_estate_id;customer_id;agent_id;contract_date\r\n" + 
				"\r\n" + 
				">deleteAgent;agent_id\r\n" + 
				">deleteRealEstate;real_estate_id\r\n" + 
				">deleteCustomer;customer_id\r\n" + 
				"\r\n" + 
				">displayAgencies\r\n" + 
				">displayAgents\r\n" + 
				">displayRealEstates\r\n" + 
				">displayCustomers\r\n" + 
				">displayContracts\r\n" + 
				"\r\n" + 
				">search;type;status;town;city;min_surface_area-max_surface_area;min_price-max_price;min_#_of_rooms-max_#_of_rooms\r\n" + 
				"\r\n" + 
				">calculateSalaries;month/year\r\n" + 
				">calculateTotalIncome;month/year\r\n" + 
				">mostProfitableAgency;month/year\r\n" + 
				">agentOfTheMonth;month/year\r\n"
				
				);
		
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	






