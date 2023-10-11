public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String first,String last,int total){
        this.firstName = first;
        this.lastName = last;
        this.totalSales = total;
    }

    public String toString(){
        return (this.lastName  + " "+ this.firstName + ": " + this.totalSales);
    }

    public boolean equals(Object o){
        if (o instanceof SalePerson){
            SalePerson sp = (SalePerson) o;
            return ((sp.getLastName() == this.lastName) && (sp.getFirstName() == this.firstName));
        }
        else return false;
    }

	//compare which totalSales is larger
	//use last name to break tie results of totalSales
	public int compareTo(Object o)
	{
		//check if object can be downcasted
		if(o instanceof SalePerson)
		{
			SalePerson sp = (SalePerson) o;
			
			//check if it's a tie
			if((totalSales - sp.getTotalSales()) == 0)
				return sp.getLastName().compareTo(lastName);	//in ascending alphabetical order using String's own compareTo()
			else
				return totalSales - sp.getTotalSales();
		}
		
		//when o is not an instance of SalePerson
		return -1;
	}

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getTotalSales(){
        return this.totalSales;
    }
}