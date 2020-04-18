
public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		
		if(dateControl(day, month, year) == true)
		{
			this.day = day;
			this.month = month;
			this.year = year;
		}
		else
		{
			this.day = 0;
			this.month = 0;
			this.year = 0;
			System.out.println("Invalid Date! Operation is not successful.");
		}
	}
	
	
	public Date(int month, int year) 
	{
		
		if(dateControl(month, year) == true)
		{
			this.month = month;
			this.year = year;
		}
		else
		{
			this.month = 0;
			this.year = 0;
			System.out.println("Invalid Date! Operation is not successful.");
		}
	}
	
	
	
	private boolean dateControl(int day, int month, int year) 
	{
		if ( ((day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )) || 
				(day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11 )) || (day <= 28 && month == 2) || (day == 29 && month == 2 && year % 4 == 0)) &&
				(month > 0 && month < 13) && (year > 1900 && year < 2020)) 
			return true;
		else
			return false;
	}
	
	private boolean dateControl(int month, int year) 
	{
		if ((month > 0 && month < 13) && (year > 1900 && year < 2020)) 
			return true;
		else
			return false;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String displayDate() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	
	
	
	
	
}
